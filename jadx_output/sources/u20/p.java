package u20;

/* loaded from: classes9.dex */
public final class p extends u20.c {

    /* renamed from: d, reason: collision with root package name */
    public final u20.n f423918d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(org.json.JSONObject params, java.util.List list, com.tencent.mm.feature.ecs.share.t callback) {
        super(list, callback);
        kotlin.jvm.internal.o.g(params, "params");
        kotlin.jvm.internal.o.g(callback, "callback");
        org.json.JSONObject optJSONObject = params.optJSONObject("shopParams");
        u20.n nVar = optJSONObject == null ? null : new u20.n(optJSONObject.optString("entranceGMsgID"), optJSONObject.optString("appUin"));
        if (nVar == null) {
            ((t00.m2) callback).a("model is null");
        }
        this.f423918d = nVar;
    }
}
