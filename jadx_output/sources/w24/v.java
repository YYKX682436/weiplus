package w24;

/* loaded from: classes15.dex */
public final class v implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w24.w f442642a;

    public v(w24.w wVar) {
        this.f442642a = wVar;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        w24.w wVar = this.f442642a;
        wVar.f442643e = z17;
        yz5.l lVar = wVar.f442646h;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.valueOf(z17));
        }
    }
}
