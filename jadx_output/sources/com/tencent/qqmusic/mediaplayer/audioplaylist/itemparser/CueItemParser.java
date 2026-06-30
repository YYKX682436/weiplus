package com.tencent.qqmusic.mediaplayer.audioplaylist.itemparser;

/* loaded from: classes13.dex */
public class CueItemParser extends com.tencent.qqmusic.mediaplayer.audioplaylist.itemparser.AudioPlayListItemParser {
    public static final java.lang.String TAG = "CueItemParser";
    private java.io.LineNumberReader mReader;
    protected java.util.List<com.tencent.qqmusic.mediaplayer.audioplaylist.TrackInfo> mTrackInfoList;

    public CueItemParser(java.lang.String str) {
        this.mUri = str;
        this.mTrackInfoList = new java.util.LinkedList();
    }

    private long convertTimeStrToMs(java.lang.String str) {
        java.lang.String[] split = str.split(":");
        long parseLong = java.lang.Long.parseLong(split[0]);
        return (((parseLong * 60) + java.lang.Long.parseLong(split[1])) * 1000) + (java.lang.Long.parseLong(split[2]) * 10);
    }

    private java.lang.String guessCharsetEncoding(java.lang.String str) {
        com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "CueItemParser.guessCharsetEncoding, filePath: " + str);
        return guessCharsetEncoding(new java.io.FileInputStream(str));
    }

    @Override // com.tencent.qqmusic.mediaplayer.audioplaylist.itemparser.AudioPlayListItemParser
    public boolean isParseSuccess() {
        return !this.mTrackInfoList.isEmpty();
    }

    @Override // com.tencent.qqmusic.mediaplayer.audioplaylist.itemparser.AudioPlayListItemParser
    public java.util.Iterator<com.tencent.qqmusic.mediaplayer.audioplaylist.TrackInfo> iterator() {
        return this.mTrackInfoList.iterator();
    }

    @Override // com.tencent.qqmusic.mediaplayer.audioplaylist.itemparser.AudioPlayListItemParser
    public void parse() {
        int i17;
        java.lang.String str;
        java.lang.String str2;
        java.io.File file;
        int i18;
        boolean z17;
        long j17;
        int i19;
        java.lang.String str3 = "/";
        com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "CueItemParser.parse, uri: " + this.mUri);
        java.io.File file2 = new java.io.File(this.mUri);
        this.mTrackInfoList.clear();
        try {
            try {
                this.mReader = new java.io.LineNumberReader(new java.io.InputStreamReader(new java.io.FileInputStream(file2), guessCharsetEncoding(this.mUri)));
                com.tencent.qqmusic.mediaplayer.audioplaylist.TrackInfo trackInfo = null;
                java.lang.String str4 = null;
                java.lang.String str5 = null;
                java.lang.String str6 = null;
                boolean z18 = false;
                long j18 = 0;
                int i27 = 0;
                boolean z19 = false;
                int i28 = 0;
                while (true) {
                    try {
                        java.lang.String readLine = this.mReader.readLine();
                        i28 = this.mReader.getLineNumber();
                        if (android.text.TextUtils.isEmpty(readLine)) {
                            if (!this.mTrackInfoList.isEmpty()) {
                                java.util.List<com.tencent.qqmusic.mediaplayer.audioplaylist.TrackInfo> list = this.mTrackInfoList;
                                com.tencent.qqmusic.mediaplayer.audioplaylist.TrackInfo trackInfo2 = list.get(list.size() - 1);
                                if (j18 != 0 && trackInfo2.getRange() != null && ((java.lang.Long) trackInfo2.getRange().second).longValue() == 0) {
                                    trackInfo2.setEndPostion(j18);
                                }
                                for (int i29 = 0; i29 < this.mTrackInfoList.size(); i29++) {
                                    com.tencent.qqmusic.mediaplayer.audioplaylist.TrackInfo trackInfo3 = this.mTrackInfoList.get(i29);
                                    if (!android.text.TextUtils.isEmpty(str4) && android.text.TextUtils.isEmpty(trackInfo3.getAlbum())) {
                                        trackInfo3.setAlbum(str4);
                                    }
                                    if (!android.text.TextUtils.isEmpty(str5) && android.text.TextUtils.isEmpty(trackInfo3.getPerformer())) {
                                        trackInfo3.setPerformer(str5);
                                    }
                                }
                            }
                            try {
                                this.mReader.close();
                                return;
                            } catch (java.lang.Exception e17) {
                                com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "LineNumberReader close ex", e17);
                                return;
                            }
                        }
                        if (!z18 && readLine.trim().toUpperCase().startsWith("PERFORMER")) {
                            str5 = com.tencent.qqmusic.mediaplayer.audioplaylist.itemparser.AudioPlayListItemParser.delSeprator(readLine);
                        }
                        if (z18) {
                            str = str5;
                        } else {
                            str = str5;
                            if (readLine.trim().toUpperCase().startsWith("TITLE")) {
                                str4 = com.tencent.qqmusic.mediaplayer.audioplaylist.itemparser.AudioPlayListItemParser.delSeprator(readLine);
                            }
                        }
                        java.lang.String str7 = str4;
                        if (readLine.trim().toUpperCase().startsWith("FILE")) {
                            if (z18) {
                                z18 = false;
                            }
                            if (j18 != 0 && trackInfo != null) {
                                trackInfo.setEndPostion(j18);
                            }
                            java.lang.String delSeprator = com.tencent.qqmusic.mediaplayer.audioplaylist.itemparser.AudioPlayListItemParser.delSeprator(readLine);
                            java.lang.String parent = file2.getParent();
                            if (!parent.endsWith(str3)) {
                                parent = parent + str3;
                            }
                            if (delSeprator.startsWith(str3)) {
                                delSeprator = delSeprator.substring(1);
                            }
                            java.lang.String str8 = parent + delSeprator;
                            if (!new java.io.File(str8).exists()) {
                                throw new java.io.IOException("media file in cue not exist! cue Path: " + this.mUri);
                            }
                            com.tencent.qqmusic.mediaplayer.codec.NativeDecoder nativeDecoder = new com.tencent.qqmusic.mediaplayer.codec.NativeDecoder();
                            int init = nativeDecoder.init(new com.tencent.qqmusic.mediaplayer.upstream.FileDataSource(str8));
                            if (init == 0) {
                                j18 = nativeDecoder.getAudioInformation().getDuration();
                                str2 = str3;
                                file = file2;
                            } else {
                                str2 = str3;
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                file = file2;
                                sb6.append("media item in cue init fail! ret = ");
                                sb6.append(init);
                                sb6.append(" ,path: ");
                                sb6.append(str8);
                                com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, sb6.toString());
                            }
                            nativeDecoder.release();
                            str6 = str8;
                        } else {
                            str2 = str3;
                            file = file2;
                        }
                        if (readLine.trim().toUpperCase().startsWith("TRACK")) {
                            trackInfo = new com.tencent.qqmusic.mediaplayer.audioplaylist.TrackInfo(com.tencent.qqmusic.mediaplayer.audioplaylist.AudioPlayListItemInfo.TYPE_CUE);
                            trackInfo.setFilePath(str6);
                            i18 = i27 + 1;
                            z18 = true;
                        } else {
                            i18 = i27;
                        }
                        if (z18 && readLine.trim().toUpperCase().startsWith("TITLE")) {
                            trackInfo.setTitle(com.tencent.qqmusic.mediaplayer.audioplaylist.itemparser.AudioPlayListItemParser.delSeprator(readLine));
                        }
                        if (z18 && readLine.trim().toUpperCase().startsWith("PERFORMER")) {
                            trackInfo.setPerformer(com.tencent.qqmusic.mediaplayer.audioplaylist.itemparser.AudioPlayListItemParser.delSeprator(readLine));
                        }
                        if (i18 == 1 && readLine.trim().toUpperCase().startsWith("INDEX")) {
                            if (!readLine.trim().contains(" 01 ")) {
                                throw new java.io.IOException("first item in CUE must only have feature \"INDEX 01\"!");
                            }
                            trackInfo.setStartPosition(convertTimeStrToMs(readLine.trim().split(" 01 ")[1].trim()));
                        }
                        if (i18 < 2 || !readLine.trim().toUpperCase().startsWith("INDEX")) {
                            z17 = z18;
                            j17 = j18;
                        } else if (readLine.trim().contains(" 00 ")) {
                            z17 = z18;
                            j17 = j18;
                            this.mTrackInfoList.get(i18 - 2).setEndPostion(convertTimeStrToMs(readLine.trim().split(" 00 ")[1].trim()));
                            i19 = 1;
                            z19 = true;
                            if (i18 >= i19 && readLine.trim().toUpperCase().startsWith("INDEX") && readLine.trim().contains(" 01 ")) {
                                this.mTrackInfoList.add(trackInfo);
                                com.tencent.qqmusic.mediaplayer.audioplaylist.TrackInfo trackInfo4 = new com.tencent.qqmusic.mediaplayer.audioplaylist.TrackInfo(com.tencent.qqmusic.mediaplayer.audioplaylist.AudioPlayListItemInfo.TYPE_CUE);
                                trackInfo4.setFilePath(str6);
                                trackInfo = trackInfo4;
                                z19 = false;
                            }
                            i27 = i18;
                            z18 = z17;
                            str4 = str7;
                            str5 = str;
                            str3 = str2;
                            file2 = file;
                            j18 = j17;
                        } else {
                            z17 = z18;
                            j17 = j18;
                            if (!readLine.trim().contains(" 01 ")) {
                                throw new java.io.IOException("item " + i18 + " in CUE have illegel feature \"INDEX\"!");
                            }
                            java.lang.String trim = readLine.trim().split(" 01 ")[1].trim();
                            trackInfo.setStartPosition(convertTimeStrToMs(trim));
                            if (!z19) {
                                this.mTrackInfoList.get(i18 - 2).setEndPostion(convertTimeStrToMs(trim));
                            }
                        }
                        i19 = 1;
                        if (i18 >= i19) {
                            this.mTrackInfoList.add(trackInfo);
                            com.tencent.qqmusic.mediaplayer.audioplaylist.TrackInfo trackInfo42 = new com.tencent.qqmusic.mediaplayer.audioplaylist.TrackInfo(com.tencent.qqmusic.mediaplayer.audioplaylist.AudioPlayListItemInfo.TYPE_CUE);
                            trackInfo42.setFilePath(str6);
                            trackInfo = trackInfo42;
                            z19 = false;
                        }
                        i27 = i18;
                        z18 = z17;
                        str4 = str7;
                        str5 = str;
                        str3 = str2;
                        file2 = file;
                        j18 = j17;
                    } catch (java.io.IOException e18) {
                        e = e18;
                        i17 = i28;
                        throw new com.tencent.qqmusic.mediaplayer.audioplaylist.itemparser.ParseException("Parse Exception occured", e, i17);
                    }
                }
            } catch (java.io.IOException e19) {
                e = e19;
                i17 = 0;
            }
        } catch (java.lang.Throwable th6) {
            try {
                this.mReader.close();
                throw th6;
            } catch (java.lang.Exception e27) {
                com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "LineNumberReader close ex", e27);
                throw th6;
            }
        }
    }
}
