package mo0;

/* loaded from: classes3.dex */
public final class d implements mo0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.live.core.view.LivePreviewView f330258a;

    public d(com.tencent.mm.live.core.view.LivePreviewView livePreviewView) {
        this.f330258a = livePreviewView;
    }

    @Override // mo0.b
    public void a() {
        java.util.LinkedList touchCallbackWeakList;
        com.tencent.mm.live.core.view.LivePreviewView livePreviewView = this.f330258a;
        touchCallbackWeakList = livePreviewView.getTouchCallbackWeakList();
        java.util.Iterator it = touchCallbackWeakList.iterator();
        while (it.hasNext()) {
            mo0.b bVar = (mo0.b) ((java.lang.ref.WeakReference) it.next()).get();
            if (bVar != null) {
                bVar.a();
            }
        }
        yz5.p pVar = livePreviewView.f68612n;
        if (pVar != null) {
        }
    }

    @Override // mo0.b
    public void b() {
        java.util.LinkedList touchCallbackWeakList;
        com.tencent.mm.live.core.view.LivePreviewView livePreviewView = this.f330258a;
        touchCallbackWeakList = livePreviewView.getTouchCallbackWeakList();
        java.util.Iterator it = touchCallbackWeakList.iterator();
        while (it.hasNext()) {
            mo0.b bVar = (mo0.b) ((java.lang.ref.WeakReference) it.next()).get();
            if (bVar != null) {
                bVar.b();
            }
        }
        yz5.p pVar = livePreviewView.f68612n;
        if (pVar != null) {
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
        }
    }

    @Override // mo0.b
    public boolean c(float f17, float f18, int i17, int i18, long j17) {
        java.util.LinkedList touchCallbackWeakList;
        mo0.b bVar;
        com.tencent.mm.live.core.view.LivePreviewView livePreviewView = this.f330258a;
        touchCallbackWeakList = livePreviewView.getTouchCallbackWeakList();
        java.util.Iterator it = touchCallbackWeakList.iterator();
        while (it.hasNext() && ((bVar = (mo0.b) ((java.lang.ref.WeakReference) it.next()).get()) == null || !bVar.c(f17, f18, i17, i18, j17))) {
        }
        yz5.p pVar = livePreviewView.f68612n;
        if (pVar == null) {
            return false;
        }
        return false;
    }

    @Override // mo0.b
    public void d() {
        yz5.a aVar = this.f330258a.f68614p;
        if (aVar != null) {
        }
    }

    @Override // mo0.b
    public boolean e(float f17, float f18) {
        java.util.LinkedList touchCallbackWeakList;
        mo0.b bVar;
        com.tencent.mm.live.core.view.LivePreviewView livePreviewView = this.f330258a;
        touchCallbackWeakList = livePreviewView.getTouchCallbackWeakList();
        java.util.Iterator it = touchCallbackWeakList.iterator();
        while (it.hasNext() && ((bVar = (mo0.b) ((java.lang.ref.WeakReference) it.next()).get()) == null || !bVar.e(f17, f18))) {
        }
        yz5.p pVar = livePreviewView.f68612n;
        if (pVar == null) {
            return false;
        }
        return false;
    }
}
