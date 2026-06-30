package tc5;

/* loaded from: classes10.dex */
public final class l implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI f417564d;

    public l(com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI msgHistoryGalleryUI) {
        this.f417564d = msgHistoryGalleryUI;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        if (((ym3.o) obj).f463177a == ym3.p.f463179d) {
            this.f417564d.K = false;
        }
        return jz5.f0.f302826a;
    }
}
