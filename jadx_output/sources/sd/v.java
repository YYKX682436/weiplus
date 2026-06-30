package sd;

/* loaded from: classes8.dex */
public class v extends java.util.LinkedList {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sd.w f406659d;

    public v(sd.w wVar, sd.m mVar) {
        this.f406659d = wVar;
    }

    @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque, java.util.Queue
    public boolean add(java.lang.Object obj) {
        boolean add = super.add(obj);
        if (add) {
            this.f406659d.d();
        }
        return add;
    }

    @Override // java.util.LinkedList, java.util.Deque
    public java.lang.Object pop() {
        java.lang.Object pop = super.pop();
        ((com.tencent.mm.plugin.webview.luggage.b4) this.f406659d).k();
        return pop;
    }

    @Override // java.util.LinkedList, java.util.Deque
    public void push(java.lang.Object obj) {
        super.push(obj);
        this.f406659d.d();
    }

    @Override // java.util.LinkedList, java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public java.lang.Object remove(int i17) {
        java.lang.Object remove = super.remove(i17);
        ((com.tencent.mm.plugin.webview.luggage.b4) this.f406659d).k();
        return remove;
    }

    @Override // java.util.LinkedList, java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public void add(int i17, java.lang.Object obj) {
        super.add(i17, obj);
        this.f406659d.d();
    }
}
