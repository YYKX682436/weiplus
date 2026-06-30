package sv2;

/* loaded from: classes10.dex */
public final class e implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sv2.f f413269a;

    public e(sv2.f fVar) {
        this.f413269a = fVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        int i18 = fVar.f70616b;
        java.lang.String str = fVar.f70617c;
        com.tencent.mm.protobuf.f resp = fVar.f70618d;
        kotlin.jvm.internal.o.f(resp, "resp");
        sv2.f fVar2 = this.f413269a;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = fVar2.f413274n;
        finderItem.trackDraftPost("doAdDraftPostSceneEnd");
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.pp2) resp).getCustom(1);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("svrFinderObj id:");
        sb6.append(pm0.v.u(finderObject != null ? finderObject.getId() : 0L));
        sb6.append(", localId:");
        com.tencent.mm.plugin.finder.storage.x80 x80Var = fVar2.f413271h;
        sb6.append(x80Var.field_localId);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str2 = fVar2.f413273m;
        com.tencent.mars.xlog.Log.i(str2, sb7);
        if (finderObject != null && (objectDesc = finderObject.getObjectDesc()) != null && (media = objectDesc.getMedia()) != null && (finderMedia = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media)) != null) {
            com.tencent.mars.xlog.Log.i(str2, "full_cover_url:" + finderMedia.getFull_cover_url() + " full_cover_url_token:" + finderMedia.getFull_cover_url_token());
        }
        java.util.concurrent.CountDownLatch countDownLatch = fVar2.f413276p;
        if (i17 == 0 && i18 == 0 && finderObject != null) {
            fVar2.f413275o = new sv2.b(x80Var);
            countDownLatch.countDown();
            ov2.e.i(fVar2, "andr_Cgi_Draft_Suc", fVar2.f413274n, 0, null, 12, null);
            com.tencent.mm.autogen.events.FeedPostProgressEvent feedPostProgressEvent = new com.tencent.mm.autogen.events.FeedPostProgressEvent();
            long j17 = x80Var.field_localId;
            am.ga gaVar = feedPostProgressEvent.f54250g;
            gaVar.f6749a = j17;
            gaVar.f6750b = 100;
            gaVar.f6751c = 2;
            feedPostProgressEvent.e();
        } else {
            fVar2.f413275o = new sv2.a(x80Var, i17, i18, str == null ? "" : str);
            countDownLatch.countDown();
            fVar2.h("andr_Cgi_Draft_Fail", finderItem, i18, str);
            com.tencent.mm.autogen.events.FeedPostProgressEvent feedPostProgressEvent2 = new com.tencent.mm.autogen.events.FeedPostProgressEvent();
            long j18 = x80Var.field_localId;
            am.ga gaVar2 = feedPostProgressEvent2.f54250g;
            gaVar2.f6749a = j18;
            gaVar2.f6750b = 100;
            gaVar2.f6751c = 3;
            feedPostProgressEvent2.e();
        }
        return jz5.f0.f302826a;
    }
}
