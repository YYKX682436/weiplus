package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes.dex */
public final class c2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f143518d;

    /* renamed from: e, reason: collision with root package name */
    public int f143519e;

    /* renamed from: f, reason: collision with root package name */
    public int f143520f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f143521g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f143522h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.d2 f143523i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f143524m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.util.List f143525n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(org.json.JSONArray jSONArray, java.lang.Integer num, com.tencent.mm.plugin.lite.jsapi.comms.d2 d2Var, int i17, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f143521g = jSONArray;
        this.f143522h = num;
        this.f143523i = d2Var;
        this.f143524m = i17;
        this.f143525n = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.lite.jsapi.comms.c2(this.f143521g, this.f143522h, this.f143523i, this.f143524m, this.f143525n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.lite.jsapi.comms.c2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0037 A[Catch: Exception -> 0x009d, TRY_ENTER, TryCatch #0 {Exception -> 0x009d, blocks: (B:10:0x00de, B:13:0x0037, B:15:0x003e, B:16:0x0047, B:18:0x004d, B:19:0x0056, B:21:0x005c, B:24:0x0069, B:29:0x007a, B:33:0x009f, B:35:0x00b2, B:37:0x00b8, B:38:0x00c2, B:41:0x00bd, B:45:0x00e1), top: B:9:0x00de }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e1 A[Catch: Exception -> 0x009d, TRY_LEAVE, TryCatch #0 {Exception -> 0x009d, blocks: (B:10:0x00de, B:13:0x0037, B:15:0x003e, B:16:0x0047, B:18:0x004d, B:19:0x0056, B:21:0x005c, B:24:0x0069, B:29:0x007a, B:33:0x009f, B:35:0x00b2, B:37:0x00b8, B:38:0x00c2, B:41:0x00bd, B:45:0x00e1), top: B:9:0x00de }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0067 -> B:9:0x00de). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0076 -> B:9:0x00de). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x009a -> B:9:0x00de). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00db -> B:9:0x00de). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.lite.jsapi.comms.c2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
