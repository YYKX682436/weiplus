package d83;

/* loaded from: classes5.dex */
public final class f0 implements e70.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d83.h0 f226966a;

    public f0(d83.h0 h0Var) {
        this.f226966a = h0Var;
    }

    @Override // e70.c0
    public void a(com.tencent.wechat.aff.ilink_stream.g data) {
        kotlin.jvm.internal.o.g(data, "data");
        java.util.Iterator it = this.f226966a.f226973d.iterator();
        while (it.hasNext()) {
            ((e70.c0) it.next()).a(data);
        }
    }

    @Override // e70.c0
    public void b(com.tencent.wechat.aff.ilink_stream.b0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        java.util.Iterator it = this.f226966a.f226973d.iterator();
        while (it.hasNext()) {
            ((e70.c0) it.next()).b(data);
        }
    }

    @Override // e70.c0
    public void c(com.tencent.wechat.aff.ilink_stream.v data) {
        kotlin.jvm.internal.o.g(data, "data");
        java.util.Iterator it = this.f226966a.f226973d.iterator();
        while (it.hasNext()) {
            ((e70.c0) it.next()).c(data);
        }
    }

    @Override // e70.c0
    public void d(com.tencent.wechat.aff.ilink_stream.a abortInfo) {
        kotlin.jvm.internal.o.g(abortInfo, "abortInfo");
        d83.h0 h0Var = this.f226966a;
        java.util.Iterator it = h0Var.f226973d.iterator();
        while (it.hasNext()) {
            ((e70.c0) it.next()).d(abortInfo);
        }
        h0Var.f226975f.invoke();
        kotlinx.coroutines.r2 r2Var = h0Var.f226974e;
        if (r2Var != null) {
            h0Var.f226974e = null;
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        h0Var.f226973d.clear();
    }

    @Override // e70.c0
    public void e(java.util.List data) {
        kotlin.jvm.internal.o.g(data, "data");
        d83.h0 h0Var = this.f226966a;
        h0Var.a(false);
        java.util.Iterator it = h0Var.f226973d.iterator();
        while (it.hasNext()) {
            ((e70.c0) it.next()).e(data);
        }
    }

    @Override // e70.c0
    public void f() {
        java.util.Iterator it = this.f226966a.f226973d.iterator();
        while (it.hasNext()) {
            ((e70.c0) it.next()).f();
        }
    }

    @Override // e70.c0
    public void g(com.tencent.wechat.aff.ilink_stream.x error) {
        kotlin.jvm.internal.o.g(error, "error");
        d83.h0 h0Var = this.f226966a;
        java.util.Iterator it = h0Var.f226973d.iterator();
        while (it.hasNext()) {
            ((e70.c0) it.next()).g(error);
        }
        h0Var.f226975f.invoke();
        kotlinx.coroutines.r2 r2Var = h0Var.f226974e;
        if (r2Var != null) {
            h0Var.f226974e = null;
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        h0Var.f226973d.clear();
    }

    @Override // e70.c0
    public void h() {
        java.util.Iterator it = this.f226966a.f226973d.iterator();
        while (it.hasNext()) {
            ((e70.c0) it.next()).h();
        }
    }

    @Override // e70.c0
    public void onTimeout() {
        d83.h0 h0Var = this.f226966a;
        java.util.Iterator it = h0Var.f226973d.iterator();
        while (it.hasNext()) {
            ((e70.c0) it.next()).onTimeout();
        }
        h0Var.f226975f.invoke();
        kotlinx.coroutines.r2 r2Var = h0Var.f226974e;
        if (r2Var != null) {
            h0Var.f226974e = null;
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        h0Var.f226973d.clear();
    }
}
