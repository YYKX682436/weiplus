package um;

/* loaded from: classes10.dex */
public class e implements um.m {

    /* renamed from: d, reason: collision with root package name */
    public java.util.Stack f428675d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.Stack f428676e;

    /* renamed from: f, reason: collision with root package name */
    public int f428677f;

    @Override // um.m
    public int A3(boolean z17) {
        if (z17) {
            java.util.Stack stack = this.f428675d;
            if (stack != null) {
                return stack.size();
            }
            return 0;
        }
        java.util.Stack stack2 = this.f428676e;
        if (stack2 != null) {
            return stack2.size();
        }
        return 0;
    }

    @Override // um.m
    public void M(android.graphics.Canvas canvas, boolean z17) {
        if (z17) {
            canvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
            java.util.Iterator it = this.f428675d.iterator();
            while (it.hasNext()) {
                ((xk0.d) it.next()).a(canvas);
            }
            return;
        }
        java.util.Stack stack = this.f428675d;
        xk0.d dVar = (stack == null || stack.size() <= 0) ? null : (xk0.d) this.f428675d.peek();
        if (dVar != null) {
            dVar.a(canvas);
        }
    }

    @Override // um.m
    public void O3(android.graphics.Canvas canvas) {
        java.util.Iterator it = this.f428675d.iterator();
        while (it.hasNext()) {
            ((xk0.d) it.next()).a(canvas);
        }
    }

    @Override // um.m
    public void R2(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.DoodleCache", "[onSave] size:%s", java.lang.Integer.valueOf(this.f428675d.size()));
        java.util.Stack stack = this.f428676e;
        if (stack != null) {
            stack.clear();
        }
        this.f428676e = (java.util.Stack) this.f428675d.clone();
        if (z17) {
            this.f428675d.clear();
        }
    }

    public void a(xk0.d dVar) {
        java.util.Iterator it = this.f428675d.iterator();
        while (it.hasNext()) {
            if (((xk0.d) it.next()).f454945n == dVar.f454945n) {
                it.remove();
            }
        }
    }

    @Override // um.m
    public void add(java.lang.Object obj) {
        xk0.d dVar = (xk0.d) obj;
        java.util.Stack stack = this.f428675d;
        if (stack != null) {
            stack.push(dVar);
        }
    }

    @Override // um.m
    public void clear() {
        java.util.Stack stack = this.f428675d;
        if (stack != null) {
            stack.clear();
        }
    }

    @Override // um.m
    public void f3(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.DoodleCache", "[onRestore] size:%s", java.lang.Integer.valueOf(this.f428675d.size()));
        this.f428675d.clear();
        java.util.Stack stack = this.f428676e;
        if (stack != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.DoodleCache", "[onRestore] %s", java.lang.Integer.valueOf(stack.size()));
            this.f428675d.addAll(this.f428676e);
            if (z17) {
                this.f428676e.clear();
            }
        }
    }

    @Override // um.m
    public void o5() {
        this.f428677f++;
    }

    @Override // um.m
    public void onCreate() {
        this.f428675d = new java.util.Stack();
    }

    @Override // um.m
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.DoodleCache", "[onDestroy]");
        java.util.Stack stack = this.f428675d;
        if (stack != null) {
            stack.clear();
        }
        java.util.Stack stack2 = this.f428676e;
        if (stack2 != null) {
            stack2.clear();
        }
    }

    @Override // um.m
    public java.lang.Object pop() {
        if (this.f428675d.size() <= 0) {
            return null;
        }
        return (xk0.d) this.f428675d.pop();
    }
}
