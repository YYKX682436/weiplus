package mc5;

/* loaded from: classes3.dex */
public final class v implements com.tencent.mm.ui.chatting.gallery.d1 {
    @Override // com.tencent.mm.ui.chatting.gallery.d1
    public boolean Fc(com.tencent.mm.modelmulti.SourceImgInfo sourceImgInfo) {
        kotlin.jvm.internal.o.g(sourceImgInfo, "sourceImgInfo");
        i95.m c17 = i95.n0.c(m40.i0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        return sourceImgInfo.f71259e == 13;
    }

    @Override // com.tencent.mm.ui.chatting.gallery.d1
    public void Ob(com.tencent.mm.modelmulti.SourceImgInfo sourceImgInfo, boolean z17) {
        if (sourceImgInfo != null) {
            i95.m c17 = i95.n0.c(zy2.b6.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ya2.e1 e1Var = ya2.e1.f460472a;
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            e1Var.q(context, sourceImgInfo.f71258d, true);
        }
    }

    @Override // com.tencent.mm.ui.chatting.gallery.d1
    public java.lang.String Ze(com.tencent.mm.modelmulti.SourceImgInfo sourceImgInfo) {
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.opt);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.tencent.mm.ui.chatting.gallery.d1
    public java.lang.String dd(com.tencent.mm.modelmulti.SourceImgInfo sourceImgInfo) {
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.opt);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.tencent.mm.ui.chatting.gallery.d1
    public java.lang.String ge(com.tencent.mm.modelmulti.SourceImgInfo sourceImgInfo) {
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.opt);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }
}
