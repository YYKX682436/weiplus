package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes8.dex */
public abstract class ProfileItemView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f189812d;

    public ProfileItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public abstract void a();

    public abstract int getLayout();

    public ProfileItemView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.view.LayoutInflater.from(context).inflate(getLayout(), this);
        a();
    }
}
