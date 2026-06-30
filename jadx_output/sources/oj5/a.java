package oj5;

/* loaded from: classes14.dex */
public final class a extends java.util.ArrayList {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oj5.b f345822d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f345823e;

    public a(oj5.b bVar, androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f345822d = bVar;
        this.f345823e = recyclerView;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        super.clear();
        oj5.b bVar = this.f345822d;
        bVar.getClass();
        androidx.recyclerview.widget.f2 adapter = this.f345823e.getAdapter();
        if (adapter == null || kotlin.jvm.internal.o.b(bVar.f345835a, adapter)) {
            return;
        }
        bVar.a(adapter);
        bVar.f345835a = adapter;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(java.lang.Object obj) {
        if (obj instanceof androidx.recyclerview.widget.k3) {
            return super.contains((androidx.recyclerview.widget.k3) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(java.lang.Object obj) {
        if (obj instanceof androidx.recyclerview.widget.k3) {
            return super.indexOf((androidx.recyclerview.widget.k3) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object obj) {
        if (obj instanceof androidx.recyclerview.widget.k3) {
            return super.lastIndexOf((androidx.recyclerview.widget.k3) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(java.lang.Object obj) {
        if (obj instanceof androidx.recyclerview.widget.k3) {
            return super.remove((androidx.recyclerview.widget.k3) obj);
        }
        return false;
    }
}
