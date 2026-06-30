package com.tencent.mm.plugin.magicbrush.fs;

/* loaded from: classes7.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.fs.s f147989d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.plugin.magicbrush.fs.s sVar) {
        super(0);
        this.f147989d = sVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (java.util.Map.Entry entry : this.f147989d.f147996c.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            if (((com.tencent.mm.plugin.magicbrush.fs.a) entry.getValue()).f147946c != null) {
                linkedList.add(str);
            }
        }
        return linkedList;
    }
}
