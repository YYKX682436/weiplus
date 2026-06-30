package na5;

/* loaded from: classes14.dex */
public class c extends na5.a implements na5.b {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f335994d = new java.util.ArrayList();

    @Override // na5.b
    public void onPageEnterAnimBegin() {
        java.util.Iterator it = this.f335994d.iterator();
        while (it.hasNext()) {
            ((na5.b) it.next()).onPageEnterAnimBegin();
        }
    }

    @Override // na5.b
    public void onPageEnterAnimEnd() {
        java.util.Iterator it = this.f335994d.iterator();
        while (it.hasNext()) {
            ((na5.b) it.next()).onPageEnterAnimEnd();
        }
    }

    @Override // na5.b
    public void onPageExitAnimBegin() {
        java.util.Iterator it = this.f335994d.iterator();
        while (it.hasNext()) {
            ((na5.b) it.next()).onPageExitAnimBegin();
        }
    }

    @Override // na5.b
    public void onPageExitAnimEnd() {
        java.util.Iterator it = this.f335994d.iterator();
        while (it.hasNext()) {
            ((na5.b) it.next()).onPageExitAnimEnd();
        }
    }

    @Override // na5.b
    public void onPagePopEnterAnimBegin() {
        java.util.Iterator it = this.f335994d.iterator();
        while (it.hasNext()) {
            ((na5.b) it.next()).onPagePopEnterAnimBegin();
        }
    }

    @Override // na5.b
    public void onPagePopEnterAnimEnd() {
        java.util.Iterator it = this.f335994d.iterator();
        while (it.hasNext()) {
            ((na5.b) it.next()).onPagePopEnterAnimEnd();
        }
    }

    @Override // na5.b
    public void onPagePopExitAnimBegin() {
        java.util.Iterator it = this.f335994d.iterator();
        while (it.hasNext()) {
            ((na5.b) it.next()).onPagePopExitAnimBegin();
        }
    }

    @Override // na5.b
    public void onPagePopExitAnimEnd() {
        java.util.Iterator it = this.f335994d.iterator();
        while (it.hasNext()) {
            ((na5.b) it.next()).onPagePopExitAnimEnd();
        }
    }
}
