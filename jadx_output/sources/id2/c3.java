package id2;

/* loaded from: classes3.dex */
public final class c3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f290508d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az2.f f290509e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ id2.u3 f290510f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f290511g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f290512h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f290513i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f290514m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(xg2.h hVar, kotlin.coroutines.Continuation continuation, az2.f fVar, id2.u3 u3Var, android.content.Context context, long j17, long j18, yz5.l lVar) {
        super(2, continuation);
        this.f290508d = hVar;
        this.f290509e = fVar;
        this.f290510f = u3Var;
        this.f290511g = context;
        this.f290512h = j17;
        this.f290513i = j18;
        this.f290514m = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new id2.c3(this.f290508d, continuation, this.f290509e, this.f290510f, this.f290511g, this.f290512h, this.f290513i, this.f290514m);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        id2.c3 c3Var = (id2.c3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        c3Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        long j17;
        java.lang.String string;
        r45.o52 o52Var;
        r45.i72 i72Var;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.l71 l71Var = (r45.l71) ((xg2.i) this.f290508d).f454393b;
        this.f290509e.b();
        if (((r45.nw1) l71Var.getCustom(1)) != null) {
            id2.u3 u3Var = this.f290510f;
            u3Var.getClass();
            int e17 = c01.id.e();
            r45.nw1 nw1Var = (r45.nw1) l71Var.getCustom(1);
            int integer = nw1Var != null ? nw1Var.getInteger(6) : 0;
            if (integer == 0) {
                integer = e17;
            }
            r45.nw1 nw1Var2 = (r45.nw1) l71Var.getCustom(1);
            int integer2 = nw1Var2 != null ? nw1Var2.getInteger(4) : 0;
            if (integer2 != 0) {
                e17 = integer2;
            }
            int i17 = integer - e17;
            r45.nw1 nw1Var3 = (r45.nw1) l71Var.getCustom(1);
            int integer3 = nw1Var3 != null ? nw1Var3.getInteger(1) : 0;
            r45.nw1 nw1Var4 = (r45.nw1) l71Var.getCustom(1);
            long j18 = nw1Var4 != null ? nw1Var4.getLong(19) : 0L;
            int integer4 = l71Var.getInteger(2);
            long F0 = zl2.r4.f473950a.F0((r45.nw1) l71Var.getCustom(1));
            r45.nw1 nw1Var5 = (r45.nw1) l71Var.getCustom(1);
            int integer5 = nw1Var5 != null ? nw1Var5.getInteger(36) : 0;
            r45.nw1 nw1Var6 = (r45.nw1) l71Var.getCustom(1);
            int integer6 = nw1Var6 != null ? nw1Var6.getInteger(35) : 0;
            r45.nw1 nw1Var7 = (r45.nw1) l71Var.getCustom(1);
            long j19 = nw1Var7 != null ? nw1Var7.getLong(50) : 0L;
            int integer7 = l71Var.getInteger(5);
            r45.nw1 nw1Var8 = (r45.nw1) l71Var.getCustom(1);
            long j27 = nw1Var8 != null ? nw1Var8.getLong(62) : 0L;
            r45.nw1 nw1Var9 = (r45.nw1) l71Var.getCustom(1);
            long j28 = nw1Var9 != null ? nw1Var9.getLong(63) : 0L;
            r45.nw1 nw1Var10 = (r45.nw1) l71Var.getCustom(1);
            if (nw1Var10 != null) {
                j17 = nw1Var10.getLong(32);
                str = "FinderLivePersonalCente";
            } else {
                str = "FinderLivePersonalCente";
                j17 = 0;
            }
            boolean A = pm0.v.A(j17, 16L);
            r45.nw1 nw1Var11 = (r45.nw1) l71Var.getCustom(1);
            long j29 = nw1Var11 != null ? nw1Var11.getLong(65) : 0L;
            r45.nw1 nw1Var12 = (r45.nw1) l71Var.getCustom(1);
            long j37 = nw1Var12 != null ? nw1Var12.getLong(64) : 0L;
            java.util.LinkedList list = l71Var.getList(7);
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) l71Var.getCustom(12);
            int integer8 = l71Var.getInteger(14);
            r45.nw1 nw1Var13 = (r45.nw1) l71Var.getCustom(1);
            int integer9 = (nw1Var13 == null || (i72Var = (r45.i72) nw1Var13.getCustom(44)) == null) ? 0 : i72Var.getInteger(3);
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo2 = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) l71Var.getCustom(16);
            r45.nw1 nw1Var14 = (r45.nw1) l71Var.getCustom(1);
            r45.sl1 sl1Var = (r45.sl1) l71Var.getCustom(36);
            kotlin.jvm.internal.o.d(list);
            java.lang.String str2 = str;
            km2.b bVar = new km2.b(i17, integer3, j18, integer4, F0, integer6, integer5, j19, integer7, j27, j28, A, j29, j37, list, integer8, finderJumpInfo, integer9, finderJumpInfo2, nw1Var14, sl1Var, l71Var, null, 4194304, null);
            r45.d84 d84Var = (r45.d84) l71Var.getCustom(9);
            java.lang.String string2 = d84Var != null ? d84Var.getString(0) : null;
            if (string2 == null) {
                string2 = "";
            }
            r45.d84 d84Var2 = (r45.d84) l71Var.getCustom(9);
            boolean z17 = true;
            java.lang.String string3 = d84Var2 != null ? d84Var2.getString(1) : null;
            if (string3 == null) {
                string3 = "";
            }
            java.lang.String concat = string2.concat(string3);
            android.content.Context context = this.f290511g;
            long j38 = this.f290512h;
            long j39 = this.f290513i;
            yz5.l lVar = this.f290514m;
            u3Var.getClass();
            com.tencent.mm.feature.finder.live.v4 v4Var = (com.tencent.mm.feature.finder.live.v4) i95.n0.c(com.tencent.mm.feature.finder.live.v4.class);
            r45.nw1 nw1Var15 = bVar.f309070t;
            boolean aj6 = v4Var.aj(nw1Var15 != null ? nw1Var15.getInteger(37) : 0);
            int i18 = qs5.g.f366432a;
            r45.nw1 nw1Var16 = bVar.f309070t;
            int integer10 = (nw1Var16 == null || (o52Var = (r45.o52) nw1Var16.getCustom(28)) == null) ? 0 : o52Var.getInteger(0);
            boolean z18 = integer10 == 2 || integer10 == 8 || integer10 == 16;
            r45.nw1 nw1Var17 = bVar.f309070t;
            boolean z19 = ((nw1Var17 != null ? nw1Var17.getInteger(37) : 0) & 1048576) > 0;
            boolean z27 = z18 || !aj6;
            if (!z27) {
                r45.sl1 sl1Var2 = bVar.f309071u;
                if ((sl1Var2 != null ? sl1Var2.getInteger(0) : 0) != 0) {
                    if ((sl1Var2 != null ? sl1Var2.getInteger(1) : 0) != 0) {
                        z17 = false;
                    }
                }
            }
            com.tencent.mars.xlog.Log.i(str2, "showGenReplayPanel cantShowDanmuEntrance: " + z27 + "，cantShowHighLightLayout: " + z17);
            com.tencent.mm.plugin.finder.live.widget.pu puVar = new com.tencent.mm.plugin.finder.live.widget.pu(context, v65.m.b(u3Var.getActivity()), false, null, 12, null);
            puVar.f119431m = z27;
            puVar.f119430i = z17;
            r45.l71 l71Var2 = bVar.f309072v;
            if (l71Var2 == null || (string = l71Var2.getString(34)) == null) {
                r45.pf2 pf2Var = bVar.f309073w;
                string = pf2Var != null ? pf2Var.getString(12) : null;
            }
            puVar.f119432n = string != null ? string : "";
            u3Var.f290823h = puVar;
            puVar.f119433o = new id2.p3(u3Var, context, j38, j39, bVar, lVar);
            com.tencent.mars.xlog.Log.i(str2, "replayGenWidget show");
            java.lang.String string4 = z19 ? u3Var.getContext().getResources().getString(com.tencent.mm.R.string.d3q) : z18 ? u3Var.getContext().getResources().getString(com.tencent.mm.R.string.d3p) : u3Var.getContext().getResources().getString(com.tencent.mm.R.string.d3o);
            kotlin.jvm.internal.o.d(string4);
            com.tencent.mm.plugin.finder.live.widget.pu puVar2 = u3Var.f290823h;
            if (puVar2 != null) {
                puVar2.z(concat, string4);
            }
        } else {
            com.tencent.mars.xlog.Log.e("FinderLivePersonalCente", "get live info success, but liveInfo is null");
        }
        return jz5.f0.f302826a;
    }
}
