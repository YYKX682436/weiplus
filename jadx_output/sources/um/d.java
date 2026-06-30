package um;

/* loaded from: classes10.dex */
public class d implements um.m {

    /* renamed from: d, reason: collision with root package name */
    public java.util.Stack f428672d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.Stack f428673e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Matrix f428674f = new android.graphics.Matrix();

    @Override // um.m
    public int A3(boolean z17) {
        if (z17) {
            java.util.Stack stack = this.f428672d;
            if (stack != null) {
                return stack.size();
            }
            return 0;
        }
        java.util.Stack stack2 = this.f428673e;
        if (stack2 != null) {
            return stack2.size();
        }
        return 0;
    }

    @Override // um.m
    public void M(android.graphics.Canvas canvas, boolean z17) {
    }

    @Override // um.m
    public void O3(android.graphics.Canvas canvas) {
    }

    @Override // um.m
    public void R2(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CropCache", "[onSave] size:%s", java.lang.Integer.valueOf(this.f428672d.size()));
        java.util.Stack stack = this.f428673e;
        if (stack != null) {
            stack.clear();
        }
        this.f428673e = (java.util.Stack) this.f428672d.clone();
        if (z17) {
            this.f428672d.clear();
        }
    }

    @Override // um.m
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void add(xk0.c cVar) {
        java.util.Stack stack = this.f428672d;
        if (stack != null) {
            stack.push(cVar);
        }
    }

    @Override // um.m
    public void clear() {
        java.util.Stack stack = this.f428672d;
        if (stack != null) {
            stack.clear();
        }
    }

    @Override // um.m
    public void f3(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CropCache", "[onRestore] size:%s", java.lang.Integer.valueOf(this.f428672d.size()));
        this.f428672d.clear();
        java.util.Stack stack = this.f428673e;
        if (stack != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CropCache", "[onRestore] %s", java.lang.Integer.valueOf(stack.size()));
            this.f428672d.addAll(this.f428673e);
            if (z17) {
                this.f428673e.clear();
            }
        }
    }

    @Override // um.m
    public void o5() {
    }

    @Override // um.m
    public void onCreate() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CropCache", "[onCreate]");
        this.f428672d = new java.util.Stack();
    }

    @Override // um.m
    public void onDestroy() {
        java.util.Stack stack = this.f428672d;
        if (stack != null) {
            stack.clear();
        }
        java.util.Stack stack2 = this.f428673e;
        if (stack2 != null) {
            stack2.clear();
        }
        this.f428674f.reset();
    }

    @Override // um.m
    public java.lang.Object pop() {
        if (this.f428672d.size() > 0) {
            return (xk0.c) this.f428672d.pop();
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.CropCache", "[pop]");
        return null;
    }
}
