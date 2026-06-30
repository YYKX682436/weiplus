package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class c3 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public dm.i8 f151074d;

    /* renamed from: e, reason: collision with root package name */
    public r45.hf2 f151075e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.lifecycle.j0 f151076f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.lifecycle.g0 f151077g;

    /* renamed from: h, reason: collision with root package name */
    public final r45.ss4 f151078h;

    /* renamed from: i, reason: collision with root package name */
    public int f151079i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f151080m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f151075e = new r45.hf2();
        androidx.lifecycle.j0 j0Var = new androidx.lifecycle.j0();
        this.f151076f = j0Var;
        this.f151077g = j0Var;
        this.f151078h = new r45.ss4();
        this.f151079i = 3;
        this.f151080m = jz5.h.b(com.tencent.mm.plugin.mv.ui.uic.z2.f151562d);
    }

    public final androidx.lifecycle.j0 O6() {
        return (androidx.lifecycle.j0) ((jz5.n) this.f151080m).getValue();
    }

    public final boolean P6() {
        java.lang.Integer num = (java.lang.Integer) O6().getValue();
        return num != null && num.intValue() == 1;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc;
        r45.ef2 mvInfo;
        r45.hf2 hf2Var;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2;
        r45.ef2 mvInfo2;
        r45.hf2 hf2Var2;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc3;
        r45.ef2 mvInfo3;
        r45.hf2 hf2Var3;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc4;
        r45.ef2 mvInfo4;
        r45.hf2 hf2Var4;
        dm.i8 Ai = ((ja0.m0) ((ka0.q0) i95.n0.c(ka0.q0.class))).Ai(getActivity());
        this.f151074d = Ai;
        if (Ai != null) {
            r45.hf2 songInfo = this.f151075e;
            kotlin.jvm.internal.o.g(songInfo, "songInfo");
            songInfo.set(0, Ai.field_songName);
            songInfo.set(1, Ai.field_songSinger);
            songInfo.set(4, Ai.field_songWebUrl);
            songInfo.set(3, Ai.field_appId);
            songInfo.set(2, Ai.field_songWifiUrl);
            songInfo.set(8, Ai.field_songHAlbumUrl);
            songInfo.set(6, Ai.field_songLyric);
            songInfo.set(5, "");
        }
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("key_track_data");
        r45.ss4 ss4Var = this.f151078h;
        if (byteArrayExtra != null) {
            ss4Var.parseFrom(byteArrayExtra);
        }
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ss4Var.getCustom(0);
        if (finderObject != null && (objectDesc4 = finderObject.getObjectDesc()) != null && (mvInfo4 = objectDesc4.getMvInfo()) != null && (hf2Var4 = (r45.hf2) mvInfo4.getCustom(1)) != null) {
            this.f151075e = hf2Var4;
        }
        dm.i8 i8Var = this.f151074d;
        if (i8Var != null) {
            java.lang.String str = i8Var.field_songHAlbumUrl;
            if (str == null || str.length() == 0) {
                com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = (com.tencent.mm.protocal.protobuf.FinderObject) ss4Var.getCustom(0);
                i8Var.field_songHAlbumUrl = (finderObject2 == null || (objectDesc3 = finderObject2.getObjectDesc()) == null || (mvInfo3 = objectDesc3.getMvInfo()) == null || (hf2Var3 = (r45.hf2) mvInfo3.getCustom(1)) == null) ? null : hf2Var3.getString(8);
            }
            java.lang.String str2 = i8Var.field_songLyric;
            if (str2 == null || str2.length() == 0) {
                com.tencent.mm.protocal.protobuf.FinderObject finderObject3 = (com.tencent.mm.protocal.protobuf.FinderObject) ss4Var.getCustom(0);
                i8Var.field_songLyric = (finderObject3 == null || (objectDesc2 = finderObject3.getObjectDesc()) == null || (mvInfo2 = objectDesc2.getMvInfo()) == null || (hf2Var2 = (r45.hf2) mvInfo2.getCustom(1)) == null) ? null : hf2Var2.getString(6);
            }
        }
        this.f151079i = getIntent().getIntExtra("key_mv_enter_maker_ui_from_scene", 3);
        if (ss4Var.getInteger(6) <= 0) {
            ((ja0.o0) ((ka0.r0) i95.n0.c(ka0.r0.class))).getClass();
            int i17 = ll3.j2.f319185a;
            ss4Var.set(6, 8192);
            com.tencent.mm.protocal.protobuf.FinderObject finderObject4 = (com.tencent.mm.protocal.protobuf.FinderObject) ss4Var.getCustom(0);
            if (finderObject4 != null && (objectDesc = finderObject4.getObjectDesc()) != null && (mvInfo = objectDesc.getMvInfo()) != null && (hf2Var = (r45.hf2) mvInfo.getCustom(1)) != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvMakerDataUIC", "syncBeatTrack duration:" + hf2Var.getInteger(14));
                r45.sr4 sr4Var = new r45.sr4();
                sr4Var.f385939d = hf2Var.getString(5);
                sr4Var.f385940e = hf2Var.getString(0);
                sr4Var.f385941f = hf2Var.getString(1);
                sr4Var.f385943h = hf2Var.getString(2);
                sr4Var.f385942g = hf2Var.getString(4);
                sr4Var.f385944i = hf2Var.getInteger(14);
                sr4Var.f385945m = hf2Var;
                kotlinx.coroutines.flow.j a17 = o01.d.f341891a.a(hm3.j.f282250r.a(sr4Var));
                androidx.appcompat.app.AppCompatActivity activity = getActivity();
                kotlin.jvm.internal.o.g(activity, "activity");
                androidx.lifecycle.c1 a18 = pf5.z.f353948a.a(activity).a(um3.b.class);
                kotlin.jvm.internal.o.f(a18, "get(...)");
                v65.i.b(((um3.b) a18).O6(), null, new com.tencent.mm.plugin.mv.ui.uic.b3(a17, this, null), 1, null);
            }
        }
        this.f151076f.postValue(ss4Var);
        com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
        p2Var.W(p2Var.i(getContext(), 10, ss4Var.getLong(4) != 0));
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = com.tencent.mm.plugin.finder.report.p2.f125238b;
        if (finderFeedReportObject != null) {
            finderFeedReportObject.setDraftType(2);
        }
        long j17 = ss4Var.getLong(4);
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject2 = com.tencent.mm.plugin.finder.report.p2.f125238b;
        if (finderFeedReportObject2 != null) {
            finderFeedReportObject2.setDraftId((int) j17);
        }
    }
}
