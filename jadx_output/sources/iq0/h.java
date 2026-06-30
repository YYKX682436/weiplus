package iq0;

/* loaded from: classes7.dex */
public final class h extends iq0.a {

    /* renamed from: i, reason: collision with root package name */
    public final xq0.d f293665i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f293666j;

    public /* synthetic */ h(java.lang.String str, xq0.d dVar, jc3.l0 l0Var, java.util.List list, java.util.HashSet hashSet, xq0.a aVar, double d17, java.lang.String str2, boolean z17, java.lang.String str3, int i17, kotlin.jvm.internal.i iVar) {
        this(str, (i17 & 2) != 0 ? null : dVar, l0Var, (i17 & 8) != 0 ? kz5.p0.f313996d : list, (i17 & 16) != 0 ? null : hashSet, (i17 & 32) != 0 ? null : aVar, (i17 & 64) != 0 ? 0.0d : d17, (i17 & 128) != 0 ? null : str2, (i17 & 256) != 0 ? false : z17, (i17 & 512) != 0 ? "" : str3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.lang.String bizName, xq0.d dVar, jc3.l0 lifecycleListener, java.util.List mbJsApiList, java.util.HashSet hashSet, xq0.a aVar, double d17, java.lang.String str, boolean z17, java.lang.String customEnvParams) {
        super(bizName, lifecycleListener, mbJsApiList, hashSet, aVar, d17, z17, customEnvParams);
        kotlin.jvm.internal.o.g(bizName, "bizName");
        kotlin.jvm.internal.o.g(lifecycleListener, "lifecycleListener");
        kotlin.jvm.internal.o.g(mbJsApiList, "mbJsApiList");
        kotlin.jvm.internal.o.g(customEnvParams, "customEnvParams");
        this.f293665i = dVar;
        this.f293666j = str;
    }
}
