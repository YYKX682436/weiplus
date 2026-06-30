package com.tencent.mm.plugin.magicbrush.fs;

/* loaded from: classes7.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.fs.s f147985d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.tencent.mm.plugin.magicbrush.fs.s sVar) {
        super(0);
        this.f147985d = sVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.magicbrush.fs.s sVar = this.f147985d;
        java.util.Set<java.util.Map.Entry> entrySet = sVar.f147995b.entrySet();
        kotlin.jvm.internal.o.f(entrySet, "<get-entries>(...)");
        for (java.util.Map.Entry entry : entrySet) {
            kotlin.jvm.internal.o.d(entry);
            ((com.tencent.mm.plugin.appbrand.appcache.y8) entry.getValue()).close();
        }
        sVar.f147995b.clear();
        sVar.f147996c.clear();
        return jz5.f0.f302826a;
    }
}
