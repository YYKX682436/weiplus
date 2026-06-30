package com.tencent.mm.ui.conversation.unreadmode;

/* loaded from: classes11.dex */
public final class v implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ va5.v f208166d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f208167e;

    public v(va5.v vVar, int i17) {
        this.f208166d = vVar;
        this.f208167e = i17;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        if (view != null) {
            view.removeOnLayoutChangeListener(this);
        }
        this.f208166d.setMTotalMenuWidth(this.f208167e);
    }
}
