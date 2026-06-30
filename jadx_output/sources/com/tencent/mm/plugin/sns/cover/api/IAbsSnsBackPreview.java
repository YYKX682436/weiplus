package com.tencent.mm.plugin.sns.cover.api;

/* loaded from: classes4.dex */
public interface IAbsSnsBackPreview extends com.tencent.mm.feature.sns.api.ICoverStatusChanged {
    int getLayoutId();

    int getType();

    void loadCover(v94.g gVar);

    void onDestroy();

    void onPause();

    void onResume();

    void setCoverFoldStatusProvider(v94.k kVar);
}
