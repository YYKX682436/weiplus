package com.tencent.mm.plugin.sns.cover.api;

/* loaded from: classes4.dex */
public abstract class AbsSnsBackPreview extends android.widget.RelativeLayout implements com.tencent.mm.plugin.sns.cover.api.IAbsSnsBackPreview {
    public AbsSnsBackPreview(android.content.Context context) {
        super(context);
        android.view.LayoutInflater.from(context).inflate(getLayoutId(), (android.view.ViewGroup) this, true);
    }

    public abstract int getLayoutId();

    public abstract int getType();

    public abstract void loadCover(v94.g gVar);

    public abstract void onDestroy();

    public void onHitSnsSpring2024Action(v94.a aVar) {
    }

    public abstract void onPause();

    public abstract void onResume();

    public void setCoverFoldStatusProvider(v94.k kVar) {
    }
}
