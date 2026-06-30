package xi1;

/* loaded from: classes7.dex */
public abstract class b implements xi1.m {

    /* renamed from: b, reason: collision with root package name */
    public final xi1.g f454688b;

    /* renamed from: c, reason: collision with root package name */
    public final xi1.k f454689c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f454690d;

    /* renamed from: e, reason: collision with root package name */
    public android.webkit.WebChromeClient.CustomViewCallback f454691e;

    /* renamed from: f, reason: collision with root package name */
    public int f454692f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewGroup.LayoutParams f454693g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.ViewGroup f454694h;

    /* renamed from: j, reason: collision with root package name */
    public android.view.View f454696j;

    /* renamed from: a, reason: collision with root package name */
    public final xi1.k f454687a = new xi1.a(this);

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Set f454695i = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());

    /* renamed from: k, reason: collision with root package name */
    public boolean f454697k = false;

    public b(xi1.g gVar, xi1.k kVar) {
        this.f454689c = kVar;
        this.f454688b = gVar;
    }

    @Override // xi1.m
    public void b(android.webkit.WebChromeClient.CustomViewCallback customViewCallback) {
        this.f454691e = customViewCallback;
    }

    @Override // xi1.m
    public final boolean c() {
        return this.f454697k;
    }

    @Override // xi1.m
    public void d(xi1.c cVar) {
        if (cVar == null) {
            return;
        }
        this.f454695i.add(cVar);
    }

    @Override // xi1.m
    public void e(android.view.View view, int i17) {
        this.f454697k = true;
        xi1.k kVar = this.f454689c;
        if (kVar == null) {
            kVar = this.f454687a;
        }
        android.view.View view2 = this.f454690d;
        this.f454696j = view2;
        this.f454690d = view;
        if (view2 == null) {
            if (view.getParent() instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.getParent();
                this.f454694h = viewGroup;
                this.f454692f = viewGroup.indexOfChild(view);
                this.f454693g = view.getLayoutParams();
                this.f454694h.removeView(view);
            } else {
                this.f454692f = 0;
                this.f454694h = null;
                this.f454693g = null;
            }
            android.view.ViewGroup a17 = kVar.a(view);
            a17.addView(view, new android.view.ViewGroup.LayoutParams(-1, -1));
            a17.bringChildToFront(view);
            android.view.ViewParent parent = a17.getParent();
            if (parent != null) {
                parent.bringChildToFront(a17);
            }
            view.setX(0.0f);
            view.setY(0.0f);
        }
    }

    @Override // xi1.m
    public void f(xi1.c cVar) {
        if (cVar == null) {
            return;
        }
        this.f454695i.remove(cVar);
    }

    @Override // xi1.m
    public boolean g() {
        if (this.f454690d == null) {
            return false;
        }
        android.webkit.WebChromeClient.CustomViewCallback customViewCallback = this.f454691e;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
        }
        if (this.f454690d.getParent() instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) this.f454690d.getParent()).removeView(this.f454690d);
        }
        android.view.ViewGroup viewGroup = this.f454694h;
        if (viewGroup != null) {
            viewGroup.addView(this.f454690d, this.f454692f, this.f454693g);
        }
        this.f454690d = null;
        this.f454691e = null;
        this.f454697k = false;
        return true;
    }

    public void i() {
        java.util.Iterator it = this.f454695i.iterator();
        while (it.hasNext()) {
            ((xi1.c) it.next()).p();
        }
    }

    @Override // xi1.m
    public void release() {
        g();
        this.f454695i.clear();
        this.f454691e = null;
    }
}
