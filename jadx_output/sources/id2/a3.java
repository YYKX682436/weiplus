package id2;

/* loaded from: classes3.dex */
public final class a3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az2.f f290479d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ id2.u3 f290480e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f290481f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(az2.f fVar, id2.u3 u3Var, android.content.Context context) {
        super(1);
        this.f290479d = fVar;
        this.f290480e = u3Var;
        this.f290481f = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.modelbase.f result = (com.tencent.mm.modelbase.f) obj;
        kotlin.jvm.internal.o.g(result, "result");
        this.f290479d.b();
        int i17 = result.f70615a;
        if ((i17 == 0 && result.f70616b == 0) || hc2.p.b(i17, result.f70616b)) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) result.f70618d).getCustom(2);
            if (finderObject != null) {
                r45.nw1 liveInfo = finderObject.getLiveInfo();
                if (liveInfo != null) {
                    r45.i72 i72Var = (r45.i72) liveInfo.getCustom(44);
                    com.tencent.mars.xlog.Log.i("FinderLivePersonalCente", "jump to replay feed " + (i72Var != null ? i72Var.getLong(12) : 0L));
                    kotlinx.coroutines.l.d(v65.m.b(this.f290480e.getActivity()), null, null, new id2.q2(liveInfo, this.f290481f, null), 3, null);
                } else {
                    com.tencent.mars.xlog.Log.e("FinderLivePersonalCente", "get common detail success, but liveInfo is null");
                }
            }
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cgiGetFinderFeedComment errType:");
            sb6.append(result.f70615a);
            sb6.append(", errCode:");
            sb6.append(result.f70616b);
            sb6.append(",errMsg:");
            java.lang.String str = result.f70617c;
            if (str == null) {
                str = "";
            }
            sb6.append(str);
            com.tencent.mars.xlog.Log.i("FinderLivePersonalCente", sb6.toString());
        }
        return jz5.f0.f302826a;
    }
}
