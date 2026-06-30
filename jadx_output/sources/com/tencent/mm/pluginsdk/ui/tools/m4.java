package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes12.dex */
public class m4 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.n4 f191773a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(com.tencent.mm.pluginsdk.ui.tools.n4 n4Var, xu5.b bVar, com.tencent.mm.pluginsdk.ui.tools.r4 r4Var) {
        super(bVar);
        this.f191773a = n4Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        java.lang.Object obj = message.obj;
        com.tencent.mm.pluginsdk.ui.tools.n4 n4Var = this.f191773a;
        if (obj == null) {
            n4Var.getClass();
            return;
        }
        java.util.LinkedList linkedList = n4Var.f191791b;
        if (linkedList.size() < n4Var.f191790a) {
            linkedList.add(obj);
        }
    }
}
