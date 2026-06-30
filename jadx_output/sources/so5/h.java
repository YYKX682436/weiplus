package so5;

/* loaded from: classes14.dex */
public final class h implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f410841d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so5.m f410842e;

    public h(int i17, so5.m mVar) {
        this.f410841d = i17;
        this.f410842e = mVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        uo5.j jVar = (uo5.j) obj;
        boolean z17 = jVar instanceof uo5.e;
        int i17 = this.f410841d;
        if (z17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("decoder ");
            sb6.append(i17);
            sb6.append(" error ");
            uo5.e eVar = (uo5.e) jVar;
            sb6.append(eVar.f429717a);
            com.tencent.mars.xlog.Log.e("MicroMsg.ILinkVoIP.DecoderManager", sb6.toString());
            so5.m mVar = this.f410842e;
            so5.d dVar = (so5.d) mVar.f410881n.get(i17);
            if (dVar != null) {
                dVar.a();
            }
            mVar.f410881n.remove(i17);
            android.util.SparseArray sparseArray = mVar.f410882o;
            if (sparseArray.indexOfKey(i17) < 0) {
                sparseArray.put(i17, new so5.c(0, 1, null));
            }
            ((so5.c) sparseArray.get(i17)).f410799a++;
            kotlinx.coroutines.v2.b(continuation.getContext(), new java.util.concurrent.CancellationException("mid " + i17 + ' ' + eVar.f429717a));
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.ILinkVoIP.DecoderManager", "decoder " + i17 + " state change " + jVar);
        }
        return jz5.f0.f302826a;
    }
}
