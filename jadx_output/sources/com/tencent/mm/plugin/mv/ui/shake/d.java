package com.tencent.mm.plugin.mv.ui.shake;

/* loaded from: classes10.dex */
public class d implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.shake.MusicMainUINew f150939a;

    public d(com.tencent.mm.plugin.mv.ui.shake.MusicMainUINew musicMainUINew) {
        this.f150939a = musicMainUINew;
    }

    @Override // db5.c1
    public void e(int i17) {
        android.graphics.Bitmap bitmap;
        com.tencent.mm.plugin.mv.ui.shake.MusicMainUINew musicMainUINew = this.f150939a;
        if (i17 == 0) {
            r45.hf2 a17 = musicMainUINew.E.a(musicMainUINew.getContext());
            ot0.q qVar = new ot0.q();
            qVar.f348666i = 76;
            qVar.f348654f = a17.getString(0);
            qVar.f348658g = a17.getString(1);
            qVar.Z = a17.getString(12);
            qVar.f348674k = a17.getString(4) != null ? a17.getString(4) : "";
            qVar.f348678l = "";
            qVar.V = a17.getString(2) != null ? a17.getString(2) : "";
            qVar.W = "";
            qVar.f348646d = "wx5aa333606550dfd5";
            com.tencent.mm.pluginsdk.ui.tools.i0 i0Var = new com.tencent.mm.pluginsdk.ui.tools.i0();
            i0Var.f191690b = a17.getString(8);
            i0Var.f191691c = a17.getString(6);
            i0Var.f191704p = a17.getString(18);
            i0Var.f191694f = a17.getString(8);
            i0Var.f191690b = a17.getString(8);
            i0Var.f191691c = a17.getString(6);
            i0Var.f191696h = a17.getString(1);
            i0Var.f191697i = a17.getString(7);
            i0Var.f191698j = a17.getString(9);
            i0Var.f191699k = java.lang.String.valueOf(a17.getLong(11));
            i0Var.f191700l = a17.getString(13);
            i0Var.f191702n = a17.getInteger(14);
            i0Var.f191701m = a17.getString(12);
            i0Var.f191703o = ((r45.if2) a17.getCustom(17)) != null ? ((r45.if2) a17.getCustom(17)).getString(0) : "";
            i0Var.f191705q = "wx485a97c844086dc9";
            qVar.f(i0Var);
            java.lang.String u17 = ot0.q.u(qVar, null, null);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Retr_Msg_Type", 2);
            intent.putExtra("Retr_Msg_content", u17);
            intent.putExtra("Multi_Retr", true);
            intent.putExtra("Retr_go_to_chattingUI", false);
            intent.putExtra("Retr_show_success_tips", true);
            com.tencent.mm.plugin.mv.ui.shake.d0 d0Var = com.tencent.mm.plugin.mv.ui.shake.d0.f150940a;
            com.tencent.mm.plugin.mv.ui.shake.d0.f150941b.f60321q = 0L;
            d0Var.a(254);
            j45.l.v(musicMainUINew.getContext(), ".ui.transmit.MsgRetransmitUI", intent, 1);
            return;
        }
        if (i17 != 1) {
            return;
        }
        r45.hf2 a18 = musicMainUINew.E.a(musicMainUINew.getContext());
        r45.xs4 xs4Var = new r45.xs4();
        b21.r rVar = musicMainUINew.f150907m;
        xs4Var.set(4, a18.getString(1));
        xs4Var.set(5, a18.getString(7));
        xs4Var.set(7, a18.getString(9));
        xs4Var.set(8, java.lang.Long.valueOf(a18.getLong(11)));
        xs4Var.set(9, a18.getString(13));
        xs4Var.set(10, java.lang.Integer.valueOf(a18.getInteger(14)));
        xs4Var.set(6, a18.getString(12));
        xs4Var.set(12, ((r45.if2) a18.getCustom(17)) != null ? ((r45.if2) a18.getCustom(17)).getString(0) : "");
        xs4Var.set(11, a18.getString(18));
        xs4Var.set(17, "wx485a97c844086dc9");
        com.tencent.mm.plugin.mv.ui.shake.d0 d0Var2 = com.tencent.mm.plugin.mv.ui.shake.d0.f150940a;
        com.tencent.mm.plugin.mv.ui.shake.d0.f150941b.f60321q = 0L;
        d0Var2.a(com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR);
        androidx.appcompat.app.AppCompatActivity context = musicMainUINew.getContext();
        com.tencent.mm.opensdk.modelmsg.WXMusicObject wXMusicObject = new com.tencent.mm.opensdk.modelmsg.WXMusicObject();
        wXMusicObject.musicUrl = rVar.f17354p;
        wXMusicObject.musicDataUrl = rVar.f17352n;
        java.lang.String str = rVar.f17353o;
        wXMusicObject.musicLowBandUrl = str;
        wXMusicObject.musicLowBandDataUrl = str;
        wXMusicObject.songAlbumUrl = a18.getString(8);
        wXMusicObject.songLyric = a18.getString(6);
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage();
        wXMediaMessage.mediaObject = wXMusicObject;
        wXMediaMessage.title = a18.getString(0);
        wXMediaMessage.description = rVar.f17349h;
        wXMediaMessage.messageExt = a18.getString(12) != null ? a18.getString(12) : "";
        ((ja0.o0) ((ka0.r0) i95.n0.c(ka0.r0.class))).getClass();
        java.lang.String f17 = ll3.j2.f(rVar);
        if (f17 == null || !com.tencent.mm.vfs.w6.j(f17)) {
            bitmap = null;
        } else {
            java.lang.Float valueOf = java.lang.Float.valueOf(context.getResources().getDimension(com.tencent.mm.R.dimen.f479867hg));
            bitmap = com.tencent.mm.sdk.platformtools.x.j0(f17, valueOf.intValue(), valueOf.intValue(), 0.0f);
        }
        if (bitmap != null) {
            wXMediaMessage.thumbData = com.tencent.mm.sdk.platformtools.t8.a(bitmap, true);
        } else {
            wXMediaMessage.thumbData = com.tencent.mm.sdk.platformtools.t8.a(com.tencent.mm.sdk.platformtools.x.c0(com.tencent.mm.ui.bk.C() ? com.tencent.mm.R.drawable.ar6 : com.tencent.mm.R.drawable.ar7), true);
        }
        android.content.Intent intent2 = new android.content.Intent();
        android.os.Bundle bundle = new android.os.Bundle();
        com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req req = new com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req();
        req.message = wXMediaMessage;
        req.toBundle(bundle);
        intent2.putExtra("Ksnsupload_timeline", bundle);
        intent2.putExtra("Ksnsupload_musicid", rVar.f17346e);
        lt.i0 i0Var2 = (lt.i0) i95.n0.c(lt.i0.class);
        ((ja0.o0) ((ka0.r0) i95.n0.c(ka0.r0.class))).getClass();
        if (((kt.c) i0Var2).bj(ll3.j2.d(rVar))) {
            intent2.putExtra("Ksnsupload_appid", "wx5aa333606550dfd5");
        }
        ((ja0.o0) ((ka0.r0) i95.n0.c(ka0.r0.class))).getClass();
        intent2.putExtra("Ksnsupload_appname", ll3.j2.e(rVar));
        java.lang.String a19 = c01.n2.a("music_player");
        c01.n2.d().c(a19, true).i("prePublishId", "music_player");
        intent2.putExtra("reportSessionId", a19);
        intent2.putExtra("Ksnsupload_music_share_object_xml", ((m21.r) ((ee0.t4) ((fe0.n4) i95.n0.c(fe0.n4.class))).wi(xs4Var)).a());
        intent2.putExtra("Ksnsupload_type", 25);
        intent2.putExtra("need_result", true);
        j45.l.w((com.tencent.mm.ui.MMActivity) musicMainUINew.getHostActivity(), ".plugin.sns.ui.SnsUploadUI", intent2, 1, new com.tencent.mm.plugin.mv.ui.shake.e(musicMainUINew));
    }
}
