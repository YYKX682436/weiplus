package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class db implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f200884a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f200885b;

    public db(java.lang.String str, kotlin.jvm.internal.h0 h0Var) {
        this.f200884a = str;
        this.f200885b = h0Var;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public final void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.mm.ui.chatting.gallery.eb ebVar = com.tencent.mm.ui.chatting.gallery.eb.f200902a;
        com.tencent.mars.xlog.Log.i("MicroMsg.MpShareViewUtil", "getplayurl errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
        com.tencent.mm.ui.chatting.gallery.eb ebVar2 = com.tencent.mm.ui.chatting.gallery.eb.f200902a;
        com.tencent.mm.ui.chatting.gallery.eb.f200903b.remove(this.f200884a);
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.chatting.gallery.cb(this.f200885b, i17, i18, str, oVar));
    }
}
