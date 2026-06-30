package com.tencent.thumbplayer.composition;

/* loaded from: classes16.dex */
public class TPMediaCompositionXmlGenerator {
    private static final java.lang.String TAG = "TPMediaCompositionXmlGenerator";

    private static void appendWithPreferredProperty(org.xmlpull.v1.XmlSerializer xmlSerializer, com.tencent.thumbplayer.api.composition.ITPMediaAsset iTPMediaAsset) {
        com.tencent.thumbplayer.api.composition.ITPMediaAssetExtraParam extraParam = iTPMediaAsset.getExtraParam();
        if (extraParam == null) {
            return;
        }
        appendWithPreferredType(xmlSerializer, extraParam, com.tencent.thumbplayer.api.composition.ITPMediaAssetExtraParam.TP_PLAYER_EXTRA_PARAM_PREFERRED_AUDIO);
        appendWithPreferredType(xmlSerializer, extraParam, com.tencent.thumbplayer.api.composition.ITPMediaAssetExtraParam.TP_PLAYER_EXTRA_PARAM_PREFERRED_SUBTITLE);
        appendWithPreferredType(xmlSerializer, extraParam, com.tencent.thumbplayer.api.composition.ITPMediaAssetExtraParam.TP_PLAYER_EXTRA_PARAM_PREFERRED_VIDEO);
    }

    private static void appendWithPreferredType(org.xmlpull.v1.XmlSerializer xmlSerializer, com.tencent.thumbplayer.api.composition.ITPMediaAssetExtraParam iTPMediaAssetExtraParam, java.lang.String str) {
        com.tencent.thumbplayer.composition.TPMediaAssetOrderedMap tPMediaAssetOrderedMap = (com.tencent.thumbplayer.composition.TPMediaAssetOrderedMap) iTPMediaAssetExtraParam.getExtraObject(str);
        if (tPMediaAssetOrderedMap == null) {
            return;
        }
        xmlSerializer.startTag("", str);
        xmlSerializer.text(filterXmlIllegalString(tPMediaAssetOrderedMap.getKeyValueStr()));
        xmlSerializer.endTag("", str);
    }

    public static java.lang.String buildAssetXmlFromComposition(com.tencent.thumbplayer.api.composition.ITPMediaComposition iTPMediaComposition) {
        if (iTPMediaComposition == null) {
            return "";
        }
        org.xmlpull.v1.XmlSerializer newSerializer = android.util.Xml.newSerializer();
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        newSerializer.setOutput(stringWriter);
        newSerializer.startDocument(com.tencent.mapsdk.internal.rv.f51270c, java.lang.Boolean.TRUE);
        newSerializer.startTag("", "assets");
        java.util.List<com.tencent.thumbplayer.api.composition.ITPMediaTrack> allAVTracks = iTPMediaComposition.getAllAVTracks();
        if (com.tencent.thumbplayer.utils.TPCommonUtils.isEmpty(allAVTracks)) {
            java.util.List<com.tencent.thumbplayer.api.composition.ITPMediaTrack> allVideoTracks = iTPMediaComposition.getAllVideoTracks();
            java.util.List<com.tencent.thumbplayer.api.composition.ITPMediaTrack> allAudioTracks = iTPMediaComposition.getAllAudioTracks();
            if (com.tencent.thumbplayer.utils.TPCommonUtils.isEmpty(allVideoTracks) && com.tencent.thumbplayer.utils.TPCommonUtils.isEmpty(allAudioTracks)) {
                return "";
            }
            com.tencent.thumbplayer.composition.TPMediaComposition tPMediaComposition = (com.tencent.thumbplayer.composition.TPMediaComposition) iTPMediaComposition;
            long videoDuration = tPMediaComposition.getVideoDuration();
            dealWithTrackInfo(newSerializer, allVideoTracks, 2, tPMediaComposition.getAudioDuration());
            dealWithTrackInfo(newSerializer, allAudioTracks, 3, videoDuration);
        } else {
            dealWithTrackInfo(newSerializer, allAVTracks, 1, 0L);
        }
        newSerializer.endTag("", "assets");
        newSerializer.endDocument();
        return stringWriter.toString();
    }

    private static void buildWithTrackClipWithTags(org.xmlpull.v1.XmlSerializer xmlSerializer, java.util.List<com.tencent.thumbplayer.api.composition.ITPMediaTrackClip> list, java.lang.String str, java.lang.String str2) {
        xmlSerializer.startTag("", str);
        xmlSerializer.startTag("", str2);
        java.util.Iterator<com.tencent.thumbplayer.api.composition.ITPMediaTrackClip> it = list.iterator();
        while (it.hasNext()) {
            dealWithClipInfo(xmlSerializer, it.next());
        }
        xmlSerializer.endTag("", str2);
        xmlSerializer.endTag("", str);
    }

    public static java.lang.String buildXmlPathFromAudioClip(com.tencent.thumbplayer.api.composition.ITPMediaTrackClip iTPMediaTrackClip) {
        if (iTPMediaTrackClip == null || iTPMediaTrackClip.getMediaType() != 3) {
            return "";
        }
        org.xmlpull.v1.XmlSerializer newSerializer = android.util.Xml.newSerializer();
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        newSerializer.setOutput(stringWriter);
        newSerializer.startDocument(com.tencent.mapsdk.internal.rv.f51270c, java.lang.Boolean.TRUE);
        newSerializer.startTag("", "assets");
        newSerializer.startTag("", "audio_tracks");
        newSerializer.startTag("", "audio_track");
        dealWithClipInfo(newSerializer, iTPMediaTrackClip);
        newSerializer.endTag("", "audio_track");
        newSerializer.endTag("", "audio_tracks");
        newSerializer.endTag("", "assets");
        newSerializer.endDocument();
        return stringWriter.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String buildXmlPathFromDrmAsset(com.tencent.thumbplayer.api.composition.ITPMediaDRMAsset r13) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.composition.TPMediaCompositionXmlGenerator.buildXmlPathFromDrmAsset(com.tencent.thumbplayer.api.composition.ITPMediaDRMAsset):java.lang.String");
    }

    public static java.lang.String buildXmlPathFromMediaTrackClip(com.tencent.thumbplayer.api.composition.ITPMediaTrackClip iTPMediaTrackClip, com.tencent.thumbplayer.api.composition.ITPMediaTrackClip iTPMediaTrackClip2) {
        if (iTPMediaTrackClip == null && iTPMediaTrackClip2 == null) {
            return "";
        }
        org.xmlpull.v1.XmlSerializer newSerializer = android.util.Xml.newSerializer();
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        newSerializer.setOutput(stringWriter);
        newSerializer.startDocument(com.tencent.mapsdk.internal.rv.f51270c, java.lang.Boolean.TRUE);
        newSerializer.startTag("", "assets");
        if (iTPMediaTrackClip != null && iTPMediaTrackClip.getMediaType() == 2) {
            newSerializer.startTag("", "video_tracks");
            newSerializer.startTag("", "video_track");
            dealWithClipInfo(newSerializer, iTPMediaTrackClip);
            newSerializer.endTag("", "video_track");
            newSerializer.endTag("", "video_tracks");
        }
        if (iTPMediaTrackClip2 != null && iTPMediaTrackClip2.getMediaType() == 3) {
            newSerializer.startTag("", "audio_tracks");
            newSerializer.startTag("", "audio_track");
            dealWithClipInfo(newSerializer, iTPMediaTrackClip2);
            newSerializer.endTag("", "audio_track");
            newSerializer.endTag("", "audio_tracks");
        }
        newSerializer.endTag("", "assets");
        newSerializer.endDocument();
        return stringWriter.toString();
    }

    public static java.lang.String buildXmlPathFromRtcAsset(com.tencent.thumbplayer.api.composition.ITPMediaRTCAsset iTPMediaRTCAsset) {
        if (iTPMediaRTCAsset == null) {
            return "";
        }
        org.xmlpull.v1.XmlSerializer newSerializer = android.util.Xml.newSerializer();
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        newSerializer.setOutput(stringWriter);
        newSerializer.startDocument(com.tencent.mapsdk.internal.rv.f51270c, java.lang.Boolean.TRUE);
        newSerializer.startTag("", "assets");
        newSerializer.startTag("", "av_tracks");
        newSerializer.startTag("", "av_track");
        newSerializer.startTag("", "track_clip");
        newSerializer.startTag("", "clip_id");
        newSerializer.text(java.lang.Integer.toString(0));
        newSerializer.endTag("", "clip_id");
        newSerializer.startTag("", "clip_placeHolder");
        newSerializer.text("0");
        newSerializer.endTag("", "clip_placeHolder");
        newSerializer.startTag("", "clip_path");
        newSerializer.text(filterXmlIllegalString(iTPMediaRTCAsset.getRtcStreamUrl()));
        newSerializer.endTag("", "clip_path");
        newSerializer.startTag("", "clip_rtcServerUrl");
        newSerializer.text(filterXmlIllegalString(iTPMediaRTCAsset.getRtcServerUrl()));
        newSerializer.endTag("", "clip_rtcServerUrl");
        newSerializer.startTag("", "clip_rtcSdpExchangeType");
        newSerializer.text(java.lang.Integer.toString(iTPMediaRTCAsset.getRtcSdpExchangeType()));
        newSerializer.endTag("", "clip_rtcSdpExchangeType");
        newSerializer.startTag("", "clip_preferredProperty");
        appendWithPreferredProperty(newSerializer, iTPMediaRTCAsset);
        newSerializer.endTag("", "clip_preferredProperty");
        newSerializer.endTag("", "track_clip");
        newSerializer.endTag("", "av_track");
        newSerializer.endTag("", "av_tracks");
        newSerializer.endTag("", "assets");
        newSerializer.endDocument();
        return stringWriter.toString();
    }

    public static java.lang.String buildXmlPathFromTrackInfo(java.util.List<com.tencent.thumbplayer.api.composition.ITPMediaTrackClip> list, int i17) {
        java.lang.String str;
        java.lang.String str2;
        if (com.tencent.thumbplayer.utils.TPCommonUtils.isEmpty(list)) {
            return "";
        }
        if (i17 == 1) {
            str = "av_tracks";
            str2 = "av_track";
        } else if (i17 == 2) {
            str = "video_tracks";
            str2 = "video_track";
        } else {
            if (i17 != 3) {
                return "";
            }
            str = "audio_tracks";
            str2 = "audio_track";
        }
        org.xmlpull.v1.XmlSerializer newSerializer = android.util.Xml.newSerializer();
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        newSerializer.setOutput(stringWriter);
        newSerializer.startDocument(com.tencent.mapsdk.internal.rv.f51270c, java.lang.Boolean.TRUE);
        newSerializer.startTag("", "assets");
        buildWithTrackClipWithTags(newSerializer, list, str, str2);
        newSerializer.endTag("", "assets");
        newSerializer.endDocument();
        return stringWriter.toString();
    }

    public static java.lang.String buildXmlPathFromUrlAsset(com.tencent.thumbplayer.api.composition.ITPMediaUrlAsset iTPMediaUrlAsset) {
        if (iTPMediaUrlAsset == null) {
            return "";
        }
        org.xmlpull.v1.XmlSerializer newSerializer = android.util.Xml.newSerializer();
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        newSerializer.setOutput(stringWriter);
        newSerializer.startDocument(com.tencent.mapsdk.internal.rv.f51270c, java.lang.Boolean.TRUE);
        newSerializer.startTag("", "assets");
        newSerializer.startTag("", "av_tracks");
        newSerializer.startTag("", "av_track");
        newSerializer.startTag("", "track_clip");
        newSerializer.startTag("", "clip_id");
        newSerializer.text(java.lang.Integer.toString(0));
        newSerializer.endTag("", "clip_id");
        newSerializer.startTag("", "clip_placeHolder");
        newSerializer.text("0");
        newSerializer.endTag("", "clip_placeHolder");
        newSerializer.startTag("", "clip_path");
        newSerializer.text(filterXmlIllegalString(iTPMediaUrlAsset.getStreamUrl()));
        newSerializer.endTag("", "clip_path");
        newSerializer.startTag("", "clip_preferredProperty");
        appendWithPreferredProperty(newSerializer, iTPMediaUrlAsset);
        newSerializer.endTag("", "clip_preferredProperty");
        newSerializer.endTag("", "track_clip");
        newSerializer.endTag("", "av_track");
        newSerializer.endTag("", "av_tracks");
        newSerializer.endTag("", "assets");
        newSerializer.endDocument();
        return stringWriter.toString();
    }

    public static java.lang.String buildXmlPathFromVideoClip(com.tencent.thumbplayer.api.composition.ITPMediaTrackClip iTPMediaTrackClip) {
        if (iTPMediaTrackClip == null || iTPMediaTrackClip.getMediaType() != 2) {
            return "";
        }
        org.xmlpull.v1.XmlSerializer newSerializer = android.util.Xml.newSerializer();
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        newSerializer.setOutput(stringWriter);
        newSerializer.startDocument(com.tencent.mapsdk.internal.rv.f51270c, java.lang.Boolean.TRUE);
        newSerializer.startTag("", "assets");
        newSerializer.startTag("", "video_tracks");
        newSerializer.startTag("", "video_track");
        dealWithClipInfo(newSerializer, iTPMediaTrackClip);
        newSerializer.endTag("", "video_track");
        newSerializer.endTag("", "video_tracks");
        newSerializer.endTag("", "assets");
        newSerializer.endDocument();
        return stringWriter.toString();
    }

    private static void dealClipWithInterval(org.xmlpull.v1.XmlSerializer xmlSerializer, com.tencent.thumbplayer.api.composition.ITPMediaTrackClip iTPMediaTrackClip, long j17) {
        if (iTPMediaTrackClip instanceof com.tencent.thumbplayer.composition.TPEmptyTrackClip) {
            dealEmptyTrackClip(xmlSerializer, iTPMediaTrackClip, j17);
        } else if (iTPMediaTrackClip instanceof com.tencent.thumbplayer.composition.TPMediaCompositionTrackClip) {
            dealNormalTrackClip(xmlSerializer, iTPMediaTrackClip, j17);
        }
    }

    private static void dealEmptyTrackClip(org.xmlpull.v1.XmlSerializer xmlSerializer, com.tencent.thumbplayer.api.composition.ITPMediaTrackClip iTPMediaTrackClip, long j17) {
        xmlSerializer.startTag("", "track_clip");
        xmlSerializer.startTag("", "clip_id");
        xmlSerializer.text(java.lang.Integer.toString(iTPMediaTrackClip.getClipId()));
        xmlSerializer.endTag("", "clip_id");
        xmlSerializer.startTag("", "clip_placeHolder");
        xmlSerializer.text("1");
        xmlSerializer.endTag("", "clip_placeHolder");
        xmlSerializer.startTag("", "clip_playTimeMs");
        if (j17 > 0) {
            xmlSerializer.text(java.lang.Long.toString(iTPMediaTrackClip.getOriginalDurationMs() - j17));
        } else {
            xmlSerializer.text(java.lang.Long.toString(iTPMediaTrackClip.getOriginalDurationMs()));
        }
        xmlSerializer.endTag("", "clip_playTimeMs");
        xmlSerializer.endTag("", "track_clip");
    }

    private static void dealNormalTrackClip(org.xmlpull.v1.XmlSerializer xmlSerializer, com.tencent.thumbplayer.api.composition.ITPMediaTrackClip iTPMediaTrackClip, long j17) {
        xmlSerializer.startTag("", "track_clip");
        xmlSerializer.startTag("", "clip_id");
        xmlSerializer.text(java.lang.Integer.toString(iTPMediaTrackClip.getClipId()));
        xmlSerializer.endTag("", "clip_id");
        xmlSerializer.startTag("", "clip_placeHolder");
        xmlSerializer.text("0");
        xmlSerializer.endTag("", "clip_placeHolder");
        xmlSerializer.startTag("", "clip_path");
        xmlSerializer.text(filterXmlIllegalString(iTPMediaTrackClip.getFilePath()));
        xmlSerializer.endTag("", "clip_path");
        xmlSerializer.startTag("", "clip_startTimeMs");
        xmlSerializer.text(java.lang.Long.toString(iTPMediaTrackClip.getStartTimeMs()));
        xmlSerializer.endTag("", "clip_startTimeMs");
        xmlSerializer.startTag("", "clip_durationMs");
        xmlSerializer.text(java.lang.Long.toString(iTPMediaTrackClip.getOriginalDurationMs()));
        xmlSerializer.endTag("", "clip_durationMs");
        if (j17 > 0) {
            long endTimeMs = iTPMediaTrackClip.getEndTimeMs() - j17;
            long originalDurationMs = iTPMediaTrackClip.getOriginalDurationMs() - j17;
            xmlSerializer.startTag("", "clip_endTimeMs");
            xmlSerializer.text(java.lang.Long.toString(endTimeMs));
            xmlSerializer.endTag("", "clip_endTimeMs");
            xmlSerializer.startTag("", "clip_playTimeMs");
            xmlSerializer.text(java.lang.Long.toString(originalDurationMs));
            xmlSerializer.endTag("", "clip_playTimeMs");
        } else {
            xmlSerializer.startTag("", "clip_endTimeMs");
            xmlSerializer.text(java.lang.Long.toString(iTPMediaTrackClip.getEndTimeMs()));
            xmlSerializer.endTag("", "clip_endTimeMs");
            xmlSerializer.startTag("", "clip_playTimeMs");
            xmlSerializer.text(java.lang.Long.toString(iTPMediaTrackClip.getOriginalDurationMs()));
            xmlSerializer.endTag("", "clip_playTimeMs");
        }
        xmlSerializer.endTag("", "track_clip");
    }

    private static void dealWithClipInfo(org.xmlpull.v1.XmlSerializer xmlSerializer, com.tencent.thumbplayer.api.composition.ITPMediaTrackClip iTPMediaTrackClip) {
        dealClipWithInterval(xmlSerializer, iTPMediaTrackClip, 0L);
    }

    private static void dealWithTrackInfo(org.xmlpull.v1.XmlSerializer xmlSerializer, java.util.List<com.tencent.thumbplayer.api.composition.ITPMediaTrack> list, int i17, long j17) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    java.lang.String trackTagWithMediaType = getTrackTagWithMediaType(i17, true);
                    java.lang.String trackTagWithMediaType2 = getTrackTagWithMediaType(i17, false);
                    xmlSerializer.startTag("", trackTagWithMediaType);
                    for (com.tencent.thumbplayer.api.composition.ITPMediaTrack iTPMediaTrack : list) {
                        if (iTPMediaTrack.getMediaType() == i17) {
                            xmlSerializer.startTag("", trackTagWithMediaType2);
                            xmlSerializer.startTag("", "track_id");
                            xmlSerializer.text(java.lang.Integer.toString(iTPMediaTrack.getTrackId()));
                            xmlSerializer.endTag("", "track_id");
                            if (i17 != 1 && com.tencent.thumbplayer.composition.TPMediaCompositionHelper.composition_duration_strategy.equals("base_audio") && iTPMediaTrack.getTimelineDurationMs() > j17) {
                                java.util.Iterator<com.tencent.thumbplayer.api.composition.ITPMediaTrackClip> it = iTPMediaTrack.getAllTrackClips().iterator();
                                long j18 = 0;
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    com.tencent.thumbplayer.api.composition.ITPMediaTrackClip next = it.next();
                                    j18 += next.getOriginalDurationMs();
                                    if (j18 > j17) {
                                        dealClipWithInterval(xmlSerializer, next, j18 - j17);
                                        break;
                                    }
                                    dealWithClipInfo(xmlSerializer, next);
                                }
                            } else {
                                java.util.Iterator<com.tencent.thumbplayer.api.composition.ITPMediaTrackClip> it6 = iTPMediaTrack.getAllTrackClips().iterator();
                                while (it6.hasNext()) {
                                    dealWithClipInfo(xmlSerializer, it6.next());
                                }
                            }
                            xmlSerializer.endTag("", trackTagWithMediaType2);
                        }
                    }
                    xmlSerializer.endTag("", trackTagWithMediaType);
                }
            } catch (java.io.IOException e17) {
                com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
            }
        }
    }

    private static java.lang.String filterXmlIllegalString(java.lang.String str) {
        return str.replaceAll("[^\t\r\n -\ud7ff\ue000-�𐀀-\u10ffff]+", "");
    }

    private static java.lang.String getTrackTagWithMediaType(int i17, boolean z17) {
        return i17 == 1 ? z17 ? "av_tracks" : "av_track" : i17 == 2 ? z17 ? "video_tracks" : "video_track" : i17 == 3 ? z17 ? "audio_tracks" : "audio_track" : "";
    }
}
