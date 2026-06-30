package com.tencent.mm.plugin.webview.modeltools;

/* loaded from: classes.dex */
public final class l0 implements j35.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f183316a;

    public l0(kotlin.coroutines.Continuation continuation) {
        this.f183316a = continuation;
    }

    @Override // j35.b0
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        int length = permissions.length;
        boolean z17 = false;
        int i18 = 0;
        while (true) {
            if (i18 >= length) {
                z17 = true;
                break;
            } else if (grantResults[i18] != 0) {
                break;
            } else {
                i18++;
            }
        }
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f183316a.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(z17)));
    }
}
