package zy5;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f477689a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final int f477690b;

    public b(int i17) {
        if ((i17 >>> 24) < 2) {
            throw new java.lang.IllegalArgumentException("[WeakViewMap] argument tagKey must pass an application specific resource id.");
        }
        this.f477690b = i17;
    }

    public final java.lang.Object a(android.view.View view) {
        if (view == null) {
            return null;
        }
        b();
        b();
        java.util.Iterator it = this.f477689a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            if (weakReference != null && weakReference.get() == view) {
                java.lang.Object tag = view.getTag(this.f477690b);
                if (tag != null) {
                    return tag;
                }
            }
        }
        return null;
    }

    public final void b() {
        java.util.Iterator it = this.f477689a.iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            if (weakReference == null || weakReference.get() == null) {
                it.remove();
            }
        }
    }

    public final void c(android.view.View view, java.lang.Object obj) {
        int i17;
        if (view == null) {
            return;
        }
        b();
        b();
        b();
        java.util.ArrayList arrayList = this.f477689a;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            i17 = this.f477690b;
            if (!hasNext) {
                break;
            }
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            if (weakReference != null && weakReference.get() == view) {
                java.util.Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    java.lang.ref.WeakReference weakReference2 = (java.lang.ref.WeakReference) it6.next();
                    if (weakReference2 != null && weakReference2.get() == view) {
                        it6.remove();
                    }
                }
                if (view.getTag(i17) != null) {
                    view.setTag(i17, null);
                }
            }
        }
        view.setTag(i17, obj);
        arrayList.add(new java.lang.ref.WeakReference(view));
    }
}
