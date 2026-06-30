package oj5;

/* loaded from: classes14.dex */
public final class q extends java.util.concurrent.ConcurrentHashMap {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oj5.r f345876d;

    public q(oj5.r rVar) {
        this.f345876d = rVar;
    }

    public final void a(androidx.recyclerview.widget.k3 k3Var, java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        if (k3Var != null && k3Var.itemView.getParent() == null) {
            android.view.View view = k3Var.itemView;
            oj5.r rVar = this.f345876d;
            rVar.getClass();
            if ((view != null ? kotlin.jvm.internal.o.b(view.getTag(com.tencent.mm.R.id.f482351c6), 1) : false) || (k3Var instanceof oj5.p)) {
                return;
            }
            jz5.g gVar = oj5.x.f345906a;
            java.lang.reflect.Field declaredField = androidx.recyclerview.widget.k3.class.getDeclaredField("mFlags");
            declaredField.setAccessible(true);
            declaredField.set(k3Var, 6);
            android.view.View itemView = k3Var.itemView;
            kotlin.jvm.internal.o.f(itemView, "itemView");
            rVar.d(itemView, true);
            rVar.f345883f.d(k3Var);
        }
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(java.lang.Object obj) {
        if (obj instanceof java.lang.Integer) {
            return super.containsKey((java.lang.Integer) obj);
        }
        return false;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(java.lang.Object obj) {
        if (obj instanceof androidx.recyclerview.widget.k3) {
            return super.containsValue((androidx.recyclerview.widget.k3) obj);
        }
        return false;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.lang.Object get(java.lang.Object obj) {
        if (obj instanceof java.lang.Integer) {
            return (androidx.recyclerview.widget.k3) super.get((java.lang.Integer) obj);
        }
        return null;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.Map, java.util.concurrent.ConcurrentMap
    public final /* bridge */ java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        return !(obj instanceof java.lang.Integer) ? obj2 : (androidx.recyclerview.widget.k3) super.getOrDefault((java.lang.Integer) obj, (androidx.recyclerview.widget.k3) obj2);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.lang.Object remove(java.lang.Object obj) {
        if (obj instanceof java.lang.Integer) {
            return (androidx.recyclerview.widget.k3) super.remove((java.lang.Integer) obj);
        }
        return null;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.Map, java.util.concurrent.ConcurrentMap
    public final /* bridge */ boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        if ((obj instanceof java.lang.Integer) && (obj2 instanceof androidx.recyclerview.widget.k3)) {
            return super.remove((java.lang.Integer) obj, (androidx.recyclerview.widget.k3) obj2);
        }
        return false;
    }
}
