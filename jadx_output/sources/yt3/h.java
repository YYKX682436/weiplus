package yt3;

/* loaded from: classes3.dex */
public final class h implements qk.u9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yt3.i f465470a;

    public h(yt3.i iVar) {
        this.f465470a = iVar;
    }

    @Override // qk.u9
    public void a(com.tencent.mm.api.IEmojiInfo emojiInfo) {
        kotlin.jvm.internal.o.g(emojiInfo, "emojiInfo");
        com.tencent.mars.xlog.Log.i("MicroMsg.EditorVideoPluginLayoutNew", "[onSelectedEmoji] emojiInfo:%s", emojiInfo);
        if (emojiInfo.o0() == null) {
            emojiInfo.K0(emojiInfo.getMd5(), "");
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("PARAM_EDIT_EMOJI_INFO", emojiInfo);
        yt3.i iVar = this.f465470a;
        iVar.f465332d.w(ju3.c0.f301892o2, bundle);
        hk0.u0 u0Var = iVar.f465488h;
        if (u0Var != null) {
            hk0.p pVar = hk0.p.f281786d;
            hk0.z zVar = u0Var.f281818i;
            zVar.getClass();
            java.lang.String str = "EMOJI_" + java.lang.System.currentTimeMillis();
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoDataModel", "addEmojiData >> type: " + pVar + ", editId: " + str);
            java.util.LinkedList linkedList = zVar.f281849a;
            hk0.l lVar = hk0.l.f281767h;
            linkedList.add(new hk0.k(lVar, str));
            zVar.f281855g.put(str, new hk0.m(lVar, pVar, emojiInfo, null, null));
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoStateModel", "addEmoji >> " + pVar + ' ' + str);
            kotlinx.coroutines.l.d(u0Var.f281822p, null, null, new hk0.e0(u0Var, u0Var.V6(new java.util.ArrayList()), str, null), 3, null);
        }
        onHide();
    }

    @Override // qk.u9
    public void onHide() {
        this.f465470a.A().b(false);
    }
}
