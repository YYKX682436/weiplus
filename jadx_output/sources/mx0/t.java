package mx0;

/* loaded from: classes5.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f332327d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f332328e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.yy3 f332329f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f332330g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.time.MJTime f332331h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(java.lang.String str, r45.yy3 yy3Var, long j17, com.tencent.maas.model.time.MJTime mJTime, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332328e = str;
        this.f332329f = yy3Var;
        this.f332330g = j17;
        this.f332331h = mJTime;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx0.t(this.f332328e, this.f332329f, this.f332330g, this.f332331h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx0.t) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.LinkedList list;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f332327d;
        java.lang.String str = this.f332328e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.util.List list2 = (java.util.List) mx0.u.f332361a.get(str);
            if (list2 != null) {
                return list2;
            }
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = mx0.u.f332361a;
            this.f332327d = 1;
            com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            r45.tv0 tv0Var = new r45.tv0();
            r45.yy3 yy3Var = this.f332329f;
            tv0Var.set(1, java.lang.Integer.valueOf(yy3Var.f391499d));
            long j17 = this.f332330g;
            tv0Var.set(2, java.lang.Long.valueOf(j17));
            lVar.f70664a = tv0Var;
            lVar.f70665b = new r45.uv0();
            lVar.f70667d = 19044;
            lVar.f70666c = "/cgi-bin/micromsg-bin/finderbgmgetlyric";
            lVar.f70668e = 0;
            lVar.f70669f = 0;
            iVar.p(lVar.a());
            com.tencent.mars.xlog.Log.i("Finder.CgiFinderBgmGetLyric", "type: " + yy3Var + " musicId: " + j17 + ' ');
            obj = rm0.h.b(iVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        kz5.p0 p0Var = null;
        if (fVar.b()) {
            r45.oo6 oo6Var = (r45.oo6) ((r45.uv0) fVar.f70618d).getCustom(1);
            if (oo6Var == null || (list = oo6Var.getList(0)) == null) {
                p0Var = kz5.p0.f313996d;
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                int size = list.size();
                int i18 = 0;
                while (i18 < size) {
                    com.tencent.maas.model.time.MJTime fromMilliseconds = com.tencent.maas.model.time.MJTime.fromMilliseconds(((r45.h06) list.get(i18)).getLong(1));
                    int i19 = i18 + 1;
                    com.tencent.maas.model.time.MJTime fromMilliseconds2 = i19 < list.size() ? com.tencent.maas.model.time.MJTime.fromMilliseconds(((r45.h06) list.get(i19)).getLong(1)) : this.f332331h;
                    com.tencent.mm.protobuf.g byteString = ((r45.h06) list.get(i18)).getByteString(0);
                    java.lang.String i27 = byteString != null ? byteString.i() : null;
                    if (i27 == null) {
                        i27 = "";
                    }
                    arrayList.add(new com.tencent.maas.model.MJLyricInfo(fromMilliseconds, fromMilliseconds2, i27, ""));
                    i18 = i19;
                }
                p0Var = arrayList;
            }
        }
        if (p0Var != null) {
            mx0.u.f332361a.put(str, p0Var);
        }
        return p0Var;
    }
}
