package cq2;

/* loaded from: classes2.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f221374d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f221375e;

    public a(yz5.l lVar, java.util.LinkedList linkedList) {
        this.f221374d = lVar;
        this.f221375e = linkedList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.LinkedList linkedList = this.f221375e;
        if (!(!linkedList.isEmpty())) {
            linkedList = null;
        }
        this.f221374d.invoke(linkedList);
    }
}
