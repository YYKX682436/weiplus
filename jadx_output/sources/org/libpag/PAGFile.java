package org.libpag;

/* loaded from: classes13.dex */
public class PAGFile extends org.libpag.PAGComposition {

    /* loaded from: classes13.dex */
    public interface LoadListener {
        void onLoad(org.libpag.PAGFile pAGFile);
    }

    static {
        b56.a.a("pag");
        nativeInit();
    }

    private PAGFile(long j17) {
        super(j17);
    }

    public static org.libpag.PAGFile Load(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str) && (str.startsWith("http://") || str.startsWith("https://"))) {
            byte[] a17 = org.libpag.b.a(str);
            if (a17 == null) {
                return null;
            }
            return LoadFromBytes(a17, a17.length, str);
        }
        return LoadFromPath(str);
    }

    public static void LoadAsync(final java.lang.String str, final org.libpag.PAGFile.LoadListener loadListener) {
        org.libpag.NativeTask.Run(new java.lang.Runnable() { // from class: org.libpag.PAGFile$$a
            @Override // java.lang.Runnable
            public final void run() {
                org.libpag.PAGFile.a(str, loadListener);
            }
        });
    }

    private static native org.libpag.PAGFile LoadFromAssets(android.content.res.AssetManager assetManager, java.lang.String str);

    private static native org.libpag.PAGFile LoadFromBytes(byte[] bArr, int i17, java.lang.String str);

    private static native org.libpag.PAGFile LoadFromPath(java.lang.String str);

    public static native int MaxSupportedTagLevel();

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(java.lang.String str, org.libpag.PAGFile.LoadListener loadListener) {
        org.libpag.PAGFile Load = Load(str);
        if (loadListener != null) {
            loadListener.onLoad(Load);
        }
    }

    private static final native void nativeInit();

    public native org.libpag.PAGFile copyOriginal();

    public native int[] getEditableIndices(int i17);

    public native org.libpag.PAGLayer[] getLayersByEditableIndex(int i17, int i18);

    public native org.libpag.PAGText getTextData(int i17);

    public native void nativeReplaceImage(int i17, long j17);

    public native void nativeReplaceImageByName(java.lang.String str, long j17);

    public native int numImages();

    public native int numTexts();

    public native int numVideos();

    public native java.lang.String path();

    public void replaceImage(int i17, org.libpag.PAGImage pAGImage) {
        if (pAGImage == null) {
            nativeReplaceImage(i17, 0L);
        } else {
            nativeReplaceImage(i17, pAGImage.nativeContext);
        }
    }

    public void replaceImageByName(java.lang.String str, org.libpag.PAGImage pAGImage) {
        if (pAGImage == null) {
            nativeReplaceImageByName(str, 0L);
        } else {
            nativeReplaceImageByName(str, pAGImage.nativeContext);
        }
    }

    public native void replaceText(int i17, org.libpag.PAGText pAGText);

    public native void setDuration(long j17);

    public native void setTimeStretchMode(int i17);

    public native int tagLevel();

    public native int timeStretchMode();

    public static org.libpag.PAGFile Load(byte[] bArr) {
        return LoadFromBytes(bArr, bArr.length, "");
    }

    public static org.libpag.PAGFile Load(android.content.res.AssetManager assetManager, java.lang.String str) {
        return LoadFromAssets(assetManager, str);
    }
}
