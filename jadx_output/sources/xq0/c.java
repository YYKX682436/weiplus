package xq0;

/* loaded from: classes7.dex */
public final class c extends nc3.a {

    /* renamed from: j, reason: collision with root package name */
    public final xq0.d f456022j;

    public /* synthetic */ c(java.lang.String str, xq0.d dVar, java.util.List list, java.util.HashSet hashSet, xq0.a aVar, double d17, jc3.r rVar, java.lang.String str2, boolean z17, java.lang.String str3, int i17, kotlin.jvm.internal.i iVar) {
        this(str, dVar, (i17 & 4) != 0 ? kz5.p0.f313996d : list, (i17 & 8) != 0 ? null : hashSet, (i17 & 16) != 0 ? null : aVar, (i17 & 32) != 0 ? 0.0d : d17, (i17 & 64) != 0 ? null : rVar, (i17 & 128) != 0 ? null : str2, (i17 & 256) != 0 ? false : z17, (i17 & 512) != 0 ? "" : str3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.lang.String bizName, xq0.d dVar, java.util.List mbJsApiList, java.util.HashSet hashSet, xq0.a aVar, double d17, jc3.r rVar, java.lang.String str, boolean z17, java.lang.String customEnvParams) {
        super(bizName, aVar, mbJsApiList, hashSet, d17, rVar, str, z17, customEnvParams);
        kotlin.jvm.internal.o.g(bizName, "bizName");
        kotlin.jvm.internal.o.g(mbJsApiList, "mbJsApiList");
        kotlin.jvm.internal.o.g(customEnvParams, "customEnvParams");
        this.f456022j = dVar;
    }
}
