package pk4;

/* loaded from: classes10.dex */
public final class k implements pk4.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.thumbplayer.view.MMMvVideoLayout f356500a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kk4.v f356501b;

    public k(com.tencent.mm.plugin.thumbplayer.view.MMMvVideoLayout mMMvVideoLayout, kk4.v vVar) {
        this.f356500a = mMMvVideoLayout;
        this.f356501b = vVar;
    }

    @Override // pk4.v
    public void a(dk4.a aVar, long j17) {
        com.tencent.mm.plugin.thumbplayer.view.MMMvVideoLayout mMMvVideoLayout = this.f356500a;
        com.tencent.mm.plugin.thumbplayer.view.MMMvVideoLayout.d(mMMvVideoLayout, false, false, 3, null);
        kk4.v vVar = this.f356501b;
        dk4.a aVar2 = vVar.f308578c;
        long j18 = aVar2 != null ? aVar2.f234478o : 0L;
        long j19 = aVar2 != null ? aVar2.f234479p : 0L;
        java.lang.String str = mMMvVideoLayout.f174512d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("timeMs=");
        sb6.append(j17);
        sb6.append(", originOffset=");
        dk4.a aVar3 = vVar.f308578c;
        sb6.append(aVar3 != null ? java.lang.Long.valueOf(aVar3.f234479p) : null);
        sb6.append(", length=");
        dk4.a aVar4 = vVar.f308578c;
        sb6.append(aVar4 != null ? java.lang.Long.valueOf(aVar4.f234478o) : null);
        sb6.append(", media=");
        sb6.append(aVar != null ? aVar.hashCode() : 0);
        com.tencent.mars.xlog.Log.w(str, sb6.toString());
        yz5.p onProgressUpdate = mMMvVideoLayout.getOnProgressUpdate();
        if (onProgressUpdate != null) {
            onProgressUpdate.invoke(java.lang.Long.valueOf(j17 - j19), java.lang.Long.valueOf(j18));
        }
    }
}
