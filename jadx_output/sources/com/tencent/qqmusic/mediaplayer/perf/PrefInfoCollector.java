package com.tencent.qqmusic.mediaplayer.perf;

/* loaded from: classes13.dex */
public class PrefInfoCollector implements com.tencent.qqmusic.mediaplayer.perf.PlayerInfoCollector {
    private static final java.lang.String ENCODING_UTF_8 = "utf-8";
    private static final java.lang.String FILE_NAME = "pref_infos.xml";
    private static final java.lang.String NAMESPACE = null;
    private static final java.lang.String ROOT = "root";
    private static final java.lang.String TAG = "PrefInfoCollector";
    private static com.tencent.qqmusic.mediaplayer.perf.PrefInfoCollector instance;
    private android.os.HandlerThread mHandlerThread;
    private android.os.Handler mReportHandler;
    private java.io.FileOutputStream outputStream;
    private java.util.HashMap<java.lang.String, java.lang.Long> prefInfos;
    private java.lang.String reportFilePath;
    private org.xmlpull.v1.XmlSerializer xmlSerializer;

    private PrefInfoCollector() {
        this.prefInfos = null;
        this.xmlSerializer = null;
        this.prefInfos = new java.util.HashMap<>();
        this.xmlSerializer = android.util.Xml.newSerializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createOutputs() {
        try {
            java.io.File file = new java.io.File(android.os.Environment.getExternalStorageDirectory().getAbsolutePath(), FILE_NAME);
            if (file.exists()) {
                file.delete();
                file.createNewFile();
            }
            java.lang.String str = TAG;
            com.tencent.qqmusic.mediaplayer.util.Logger.d(str, "setInstrumentation: outputFile: " + file);
            this.reportFilePath = file.getAbsolutePath();
            this.outputStream = new java.io.FileOutputStream(file);
            com.tencent.qqmusic.mediaplayer.util.Logger.d(str, "setInstrumentation: outputFilepath: " + this.reportFilePath);
            try {
                this.xmlSerializer.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
                this.xmlSerializer.setOutput(this.outputStream, "utf-8");
                this.xmlSerializer.startDocument("utf-8", java.lang.Boolean.TRUE);
            } catch (java.io.IOException e17) {
                com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "Unable to open serializer", e17);
                throw new java.lang.RuntimeException("Unable to open serializer: " + e17.getMessage(), e17);
            }
        } catch (java.io.FileNotFoundException e18) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "Unable to open report file: pref_infos.xml", e18);
            throw new java.lang.RuntimeException("Unable to open report file: " + e18.getMessage(), e18);
        } catch (java.io.IOException e19) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "Unable to create report file: pref_infos.xml", e19);
            throw new java.lang.RuntimeException("Unable to create report file: " + e19.getMessage(), e19);
        }
    }

    public static synchronized com.tencent.qqmusic.mediaplayer.perf.PrefInfoCollector getInstance() {
        com.tencent.qqmusic.mediaplayer.perf.PrefInfoCollector prefInfoCollector;
        synchronized (com.tencent.qqmusic.mediaplayer.perf.PrefInfoCollector.class) {
            if (instance == null) {
                instance = new com.tencent.qqmusic.mediaplayer.perf.PrefInfoCollector();
            }
            prefInfoCollector = instance;
        }
        return prefInfoCollector;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void printPrefInfos(com.tencent.qqmusic.mediaplayer.AudioInformation audioInformation) {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.prefInfos.entrySet());
        java.util.Collections.sort(arrayList, new java.util.Comparator<java.util.Map.Entry<java.lang.String, java.lang.Long>>() { // from class: com.tencent.qqmusic.mediaplayer.perf.PrefInfoCollector.1
            @Override // java.util.Comparator
            public int compare(java.util.Map.Entry<java.lang.String, java.lang.Long> entry, java.util.Map.Entry<java.lang.String, java.lang.Long> entry2) {
                if (entry.getKey().charAt(0) > entry2.getKey().charAt(0)) {
                    return 1;
                }
                return entry.getKey().charAt(0) == entry2.getKey().charAt(0) ? 0 : -1;
            }
        });
        if (arrayList.isEmpty()) {
            return;
        }
        this.xmlSerializer.startTag(NAMESPACE, ROOT);
        printProperty("device.manufacturer", android.os.Build.MANUFACTURER);
        printProperty("device.model", android.os.Build.MODEL);
        printProperty("device.apiLevel", java.lang.String.valueOf(android.os.Build.VERSION.SDK_INT));
        printAudioInfomation(audioInformation);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            long longValue = ((java.lang.Long) entry.getValue()).longValue();
            printProperty((java.lang.String) entry.getKey(), longValue + "");
        }
        this.xmlSerializer.endTag(NAMESPACE, ROOT);
        this.xmlSerializer.endDocument();
        this.xmlSerializer.flush();
    }

    private void printProperty(java.lang.String str, java.lang.String str2) {
        org.xmlpull.v1.XmlSerializer xmlSerializer = this.xmlSerializer;
        java.lang.String str3 = NAMESPACE;
        xmlSerializer.startTag(str3, str);
        this.xmlSerializer.text(str2);
        this.xmlSerializer.endTag(str3, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void upLoadByCommonPost() {
        com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "upLoadByCommonPost");
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(" http://musict.proxy.music.qq.com/qmtm2/PlayPerformanceReport.fcg").openConnection();
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
        httpURLConnection.setRequestProperty("Charset", com.tencent.mapsdk.internal.rv.f51270c);
        httpURLConnection.setRequestProperty("Content-Type", "text/xml");
        java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(httpURLConnection.getOutputStream());
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(this.reportFilePath);
        byte[] bArr = new byte[8192];
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read == -1) {
                fileInputStream.close();
                dataOutputStream.writeBytes(com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE);
                dataOutputStream.flush();
                java.io.InputStream inputStream = httpURLConnection.getInputStream();
                java.lang.String readLine = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream, com.tencent.mapsdk.internal.rv.f51270c)).readLine();
                com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "upload result:" + readLine);
                dataOutputStream.close();
                inputStream.close();
                return;
            }
            dataOutputStream.write(bArr, 0, read);
        }
    }

    public void printAudioInfomation(com.tencent.qqmusic.mediaplayer.AudioInformation audioInformation) {
        printProperty("audio.format", audioInformation.getAudioType() + "");
        printProperty("audio.sampleRate", audioInformation.getSampleRate() + "");
        printProperty("audio.PlaySample", audioInformation.getPlaySample() + "");
        printProperty("audio.bitDepth", audioInformation.getBitDepth() + "");
        printProperty("audio.channels", audioInformation.getChannels() + "");
        printProperty("audio.duration", audioInformation.getDuration() + "");
        printProperty("audio.bitRate", audioInformation.getBitrate() + "");
    }

    @Override // com.tencent.qqmusic.mediaplayer.perf.PlayerInfoCollector
    public void putBoolean(java.lang.String str, boolean z17) {
    }

    @Override // com.tencent.qqmusic.mediaplayer.perf.PlayerInfoCollector
    public void putInt(java.lang.String str, int i17) {
    }

    @Override // com.tencent.qqmusic.mediaplayer.perf.PlayerInfoCollector
    public void putLong(java.lang.String str, long j17) {
        this.prefInfos.put(str, java.lang.Long.valueOf(j17));
    }

    @Override // com.tencent.qqmusic.mediaplayer.perf.PlayerInfoCollector
    public void putString(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.tencent.qqmusic.mediaplayer.perf.PlayerInfoCollector
    public void putUri(java.lang.String str, android.net.Uri uri) {
    }

    public void upLoadPrefInfos(final com.tencent.qqmusic.mediaplayer.AudioInformation audioInformation) {
        java.util.HashMap<java.lang.String, java.lang.Long> hashMap = this.prefInfos;
        if (hashMap == null || hashMap.isEmpty()) {
            return;
        }
        if (this.mHandlerThread == null || this.mReportHandler == null) {
            android.os.HandlerThread handlerThread = new android.os.HandlerThread(TAG);
            this.mHandlerThread = handlerThread;
            handlerThread.start();
            this.mReportHandler = new android.os.Handler(this.mHandlerThread.getLooper());
        }
        this.mReportHandler.post(new java.lang.Runnable() { // from class: com.tencent.qqmusic.mediaplayer.perf.PrefInfoCollector.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.tencent.qqmusic.mediaplayer.perf.PrefInfoCollector.this.createOutputs();
                    com.tencent.qqmusic.mediaplayer.perf.PrefInfoCollector.this.printPrefInfos(audioInformation);
                    com.tencent.qqmusic.mediaplayer.perf.PrefInfoCollector.this.upLoadByCommonPost();
                } catch (java.lang.Exception e17) {
                    com.tencent.qqmusic.mediaplayer.util.Logger.e(com.tencent.qqmusic.mediaplayer.perf.PrefInfoCollector.TAG, e17);
                }
            }
        });
    }
}
