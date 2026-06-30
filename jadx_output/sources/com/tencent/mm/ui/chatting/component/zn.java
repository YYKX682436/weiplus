package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public final class zn extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.ho f200394d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f200395e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f200396f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zn(com.tencent.mm.ui.chatting.component.ho hoVar, android.widget.TextView textView, com.tencent.mm.ui.widget.imageview.WeImageView weImageView) {
        super(2);
        this.f200394d = hoVar;
        this.f200395e = textView;
        this.f200396f = weImageView;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int i17;
        java.lang.String str;
        com.tencent.mm.ui.chatting.component.kn oldStatus = (com.tencent.mm.ui.chatting.component.kn) obj;
        com.tencent.mm.ui.chatting.component.kn newStatus = (com.tencent.mm.ui.chatting.component.kn) obj2;
        kotlin.jvm.internal.o.g(oldStatus, "oldStatus");
        kotlin.jvm.internal.o.g(newStatus, "newStatus");
        com.tencent.mm.ui.chatting.component.ho hoVar = this.f200394d;
        android.view.ViewGroup viewGroup = hoVar.f199181h;
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("useBtn");
            throw null;
        }
        if (newStatus == com.tencent.mm.ui.chatting.component.kn.f199376d) {
            i17 = 8;
        } else {
            if (viewGroup.getVisibility() != 0) {
                com.tencent.mm.ui.chatting.component.ln lnVar = hoVar.A;
                lnVar.getClass();
                com.tencent.mm.ui.chatting.component.ho hoVar2 = lnVar.f199451a;
                com.tencent.mm.sdk.platformtools.o4.M(hoVar2.r0()).putInt(lnVar.a("useTrans"), com.tencent.mm.sdk.platformtools.o4.M(hoVar2.r0()).getInt(lnVar.a("useTrans"), 0) + 1);
                java.lang.String x17 = hoVar.f198580d.x();
                com.tencent.mm.autogen.mmdata.rpt.TranslateMsgStruct translateMsgStruct = new com.tencent.mm.autogen.mmdata.rpt.TranslateMsgStruct();
                if (pn4.f1.f357105a.length() == 0) {
                    str = java.util.UUID.randomUUID().toString();
                    kotlin.jvm.internal.o.f(str, "toString(...)");
                    pn4.f1.f357105a = str;
                } else {
                    str = pn4.f1.f357105a;
                }
                translateMsgStruct.r(str);
                translateMsgStruct.f61351f = 1;
                translateMsgStruct.p("6");
                translateMsgStruct.q(x17);
                translateMsgStruct.k();
            }
            com.tencent.mm.ui.chatting.component.kn knVar = com.tencent.mm.ui.chatting.component.kn.f199377e;
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f200396f;
            android.widget.TextView textView = this.f200395e;
            if (newStatus == knVar) {
                com.tencent.mm.ui.chatting.component.LoadableTextView loadableTextView = hoVar.f199183m;
                if (loadableTextView == null) {
                    kotlin.jvm.internal.o.o("resultTv");
                    throw null;
                }
                if (loadableTextView.getF198559n().length() == 0) {
                    android.view.ViewGroup viewGroup2 = hoVar.f199181h;
                    if (viewGroup2 == null) {
                        kotlin.jvm.internal.o.o("useBtn");
                        throw null;
                    }
                    viewGroup2.setEnabled(false);
                    textView.setTextColor(hoVar.f198580d.g().getResources().getColor(com.tencent.mm.R.color.f478895k4));
                    weImageView.setIconColor(hoVar.f198580d.g().getResources().getColor(com.tencent.mm.R.color.f478895k4));
                    i17 = 0;
                }
            }
            android.view.ViewGroup viewGroup3 = hoVar.f199181h;
            if (viewGroup3 == null) {
                kotlin.jvm.internal.o.o("useBtn");
                throw null;
            }
            viewGroup3.setEnabled(true);
            textView.setTextColor(hoVar.f198580d.g().getResources().getColor(com.tencent.mm.R.color.f478502m));
            weImageView.setIconColor(hoVar.f198580d.g().getResources().getColor(com.tencent.mm.R.color.f478502m));
            i17 = 0;
        }
        viewGroup.setVisibility(i17);
        return jz5.f0.f302826a;
    }
}
