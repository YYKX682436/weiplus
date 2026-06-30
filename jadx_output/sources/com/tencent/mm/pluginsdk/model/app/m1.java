package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes8.dex */
public class m1 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j35.d f188985d;

    public m1(j35.d dVar) {
        this.f188985d = dVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCBoolean iPCBoolean = (com.tencent.mm.ipcinvoker.type.IPCBoolean) obj;
        j35.d dVar = this.f188985d;
        if (dVar != null) {
            if (iPCBoolean.f68400d) {
                dVar.a(true);
            } else {
                dVar.a(false);
            }
        }
    }
}
