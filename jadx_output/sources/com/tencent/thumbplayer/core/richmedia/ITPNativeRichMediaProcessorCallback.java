package com.tencent.thumbplayer.core.richmedia;

/* loaded from: classes16.dex */
public interface ITPNativeRichMediaProcessorCallback {
    void onDeselectFeatureSuccess(com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessor iTPNativeRichMediaProcessor, int i17);

    void onRichMediaError(com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessor iTPNativeRichMediaProcessor, int i17);

    void onRichMediaFeatureData(com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessor iTPNativeRichMediaProcessor, int i17, com.tencent.thumbplayer.core.richmedia.TPNativeRichMediaFeatureData tPNativeRichMediaFeatureData);

    void onRichMediaFeatureFailure(com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessor iTPNativeRichMediaProcessor, int i17, int i18);

    void onRichMediaInfo(com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessor iTPNativeRichMediaProcessor, int i17, long j17, long j18, long j19, java.lang.Object obj);

    void onRichMediaPrepared(com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessor iTPNativeRichMediaProcessor);

    void onSelectFeatureSuccess(com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessor iTPNativeRichMediaProcessor, int i17);
}
