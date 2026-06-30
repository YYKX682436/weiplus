package dj5;

/* loaded from: classes.dex */
public final class d implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.flow.i2 f233064d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dj5.m f233065e;

    public d(dj5.m mVar, wi5.z request, kotlinx.coroutines.flow.i2 searchFlow, int i17, boolean z17, int i18, kotlin.jvm.internal.i iVar) {
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(searchFlow, "searchFlow");
        this.f233065e = mVar;
        this.f233064d = searchFlow;
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        boolean z17;
        com.tencent.mm.sdk.coroutines.LifecycleScope O6;
        if (vVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactChatRoomMemberSearchUIC", "onFTSSearchEnd " + vVar.f351157b.hashCode());
            dj5.m mVar = this.f233065e;
            java.util.Iterator it = mVar.f233081e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z17 = false;
                    break;
                } else if (kotlin.jvm.internal.o.b((p13.c) it.next(), vVar.f351157b)) {
                    z17 = true;
                    break;
                }
            }
            if ((z17 ? vVar : null) == null || vVar.f351158c != 0 || (O6 = mVar.O6()) == null) {
                return;
            }
            v65.i.b(O6, null, new dj5.c(this, vVar, null), 1, null);
        }
    }
}
