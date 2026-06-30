package qj4;

@j95.b
/* loaded from: classes11.dex */
public final class v extends i95.w implements bi4.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Stack f363959d = new java.util.Stack();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Stack f363960e = new java.util.Stack();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Stack f363961f = new java.util.Stack();

    public java.lang.String Ai() {
        java.util.Stack stack = this.f363960e;
        if (stack.empty()) {
            return "";
        }
        java.lang.Object peek = stack.peek();
        kotlin.jvm.internal.o.f(peek, "peek(...)");
        return (java.lang.String) peek;
    }

    public java.lang.String Bi() {
        java.util.Stack stack = this.f363959d;
        if (stack.empty()) {
            Vi();
        }
        java.lang.Object peek = stack.peek();
        kotlin.jvm.internal.o.f(peek, "peek(...)");
        return (java.lang.String) peek;
    }

    public void Di() {
        java.util.Stack stack = this.f363961f;
        if (stack.empty()) {
            return;
        }
        stack.pop();
    }

    public void Ni() {
        java.util.Stack stack = this.f363959d;
        if (stack.empty()) {
            return;
        }
        stack.pop();
    }

    public java.lang.String Ri() {
        ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
        this.f363961f.push(o13.n.l(4));
        return wi();
    }

    public java.lang.String Ui() {
        ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
        this.f363960e.push(o13.n.l(3));
        return Ai();
    }

    public java.lang.String Vi() {
        ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
        this.f363959d.push(o13.n.l(1));
        return Bi();
    }

    public java.lang.String wi() {
        java.util.Stack stack = this.f363961f;
        if (stack.empty()) {
            return "";
        }
        java.lang.Object peek = stack.peek();
        kotlin.jvm.internal.o.f(peek, "peek(...)");
        return (java.lang.String) peek;
    }
}
