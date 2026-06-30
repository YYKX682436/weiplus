package com.tencent.mm.plugin.wepkg.utils;

/* loaded from: classes8.dex */
public class h implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wepkg.utils.i f188495d;

    public h(com.tencent.mm.plugin.wepkg.utils.i iVar) {
        this.f188495d = iVar;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.wepkg.utils.i iVar = this.f188495d;
        if (iVar == null) {
            return 0;
        }
        iVar.a(i17, i18, str, oVar);
        return 0;
    }
}
