package com.tencent.mm.plugin.magicbrush.demo.bizlogic;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/magicbrush/demo/bizlogic/MagicBrushDemoBizPkgManagement;", "Llc3/f0;", "", "instanceName", "<init>", "(Ljava/lang/String;)V", "mb-samples_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public class MagicBrushDemoBizPkgManagement extends lc3.f0 {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f147913e;

    /* renamed from: f, reason: collision with root package name */
    public final wc3.c f147914f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MagicBrushDemoBizPkgManagement(java.lang.String instanceName) {
        super(instanceName);
        kotlin.jvm.internal.o.g(instanceName, "instanceName");
        this.f147913e = "MagicBrushDemoPkgManagement";
        if (((he3.e) ((ie3.i) i95.n0.c(ie3.i.class))).Vi("MagicBrushDemo").length() > 0) {
            this.f147914f = new wc3.c(instanceName);
        }
    }

    @Override // jc3.x
    public java.lang.String a(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // jc3.x
    public com.tencent.mm.plugin.appbrand.appstorage.u1 b() {
        com.tencent.mm.plugin.appbrand.appstorage.u1 u1Var;
        wc3.c cVar = this.f147914f;
        return (cVar == null || (u1Var = (com.tencent.mm.plugin.appbrand.appstorage.u1) ((jz5.n) cVar.f317915g).getValue()) == null) ? new wc3.a() : u1Var;
    }

    @Override // jc3.x
    public java.lang.String d() {
        return "MagicBrushDemo";
    }

    @Override // jc3.x
    public void f(yz5.l cb6) {
        kotlin.jvm.internal.o.g(cb6, "cb");
        com.tencent.mars.xlog.Log.i(this.f147913e, "provideMainScript");
        if (this.f147914f != null) {
            ik1.b0 b0Var = new ik1.b0();
            b().readFile("/index.js", 0L, com.tencent.wcdb.core.Database.DictDefaultMatchValue, b0Var);
            if (b0Var.f291824a != null) {
                byte[] a17 = ik1.f.a((java.nio.ByteBuffer) b0Var.f291824a);
                kotlin.jvm.internal.o.f(a17, "arrayOfByteBuffer(...)");
                java.nio.charset.Charset UTF_8 = java.nio.charset.StandardCharsets.UTF_8;
                kotlin.jvm.internal.o.f(UTF_8, "UTF_8");
                cb6.invoke(kz5.b0.c(new lc3.j0(new java.lang.String(a17, UTF_8))));
                return;
            }
        }
        java.lang.String e17 = ik1.f.e("magicbrush-demo.js");
        kotlin.jvm.internal.o.f(e17, "getAssetAsString(...)");
        cb6.invoke(kz5.b0.c(new lc3.j0(e17)));
    }

    @Override // jc3.x
    public java.lang.String g() {
        return "MagicBrushDemo";
    }

    @Override // jc3.x
    public void release() {
        ((com.tencent.mm.plugin.magicbrush.m5) ((com.tencent.mm.plugin.magicbrush.d4) i95.n0.c(com.tencent.mm.plugin.magicbrush.d4.class))).wi(this.f317894d);
    }
}
