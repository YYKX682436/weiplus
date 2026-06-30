package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class fc implements sb5.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f203955a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f203956b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.gc f203957c;

    public fc(com.tencent.mm.ui.chatting.viewitems.gc gcVar, android.view.View view, java.lang.CharSequence charSequence) {
        this.f203957c = gcVar;
        this.f203955a = view;
        this.f203956b = charSequence;
    }

    @Override // sb5.h2
    public void a(int i17, java.lang.Long l17) {
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.chatting.viewitems.ec(this, l17, i17));
    }
}
