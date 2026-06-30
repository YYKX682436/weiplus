package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class yn implements sb5.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f206089a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f206090b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.zn f206091c;

    public yn(com.tencent.mm.ui.chatting.viewitems.zn znVar, android.view.View view, java.lang.CharSequence charSequence) {
        this.f206091c = znVar;
        this.f206089a = view;
        this.f206090b = charSequence;
    }

    @Override // sb5.h2
    public void a(int i17, java.lang.Long l17) {
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.chatting.viewitems.xn(this, l17, i17));
    }
}
