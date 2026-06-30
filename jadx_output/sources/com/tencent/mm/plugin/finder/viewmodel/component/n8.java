package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class n8 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f135278d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f135279e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n8(android.content.Context context, in5.s0 s0Var) {
        super(3);
        this.f135278d = context;
        this.f135279e = s0Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        android.content.DialogInterface dialog = (android.content.DialogInterface) obj;
        ((java.lang.Number) obj2).intValue();
        java.lang.CharSequence text = (java.lang.CharSequence) obj3;
        kotlin.jvm.internal.o.g(dialog, "dialog");
        kotlin.jvm.internal.o.g(text, "text");
        java.lang.String obj4 = text.toString();
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
        finderJumpInfo.setJumpinfo_type(2);
        com.tencent.mm.protocal.protobuf.Html5Info html5Info = new com.tencent.mm.protocal.protobuf.Html5Info();
        html5Info.setUrl(obj4);
        html5Info.setStyle(1);
        html5Info.setWebview_ext_info("test for debug");
        finderJumpInfo.setHtml5_info(html5Info);
        finderJumpInfo.setBusiness_type(2);
        xc2.y2.f453343a.I(this.f135278d, new xc2.p0(finderJumpInfo), this.f135279e);
        return jz5.f0.f302826a;
    }
}
