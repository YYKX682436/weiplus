package er0;

/* loaded from: classes12.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedHashMap f255969d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f255970e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(java.util.LinkedHashMap linkedHashMap, java.lang.String str) {
        super(2);
        this.f255969d = linkedHashMap;
        this.f255970e = str;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String proc = (java.lang.String) obj;
        android.app.ApplicationExitInfo exitInfo = (android.app.ApplicationExitInfo) obj2;
        kotlin.jvm.internal.o.g(proc, "proc");
        kotlin.jvm.internal.o.g(exitInfo, "exitInfo");
        java.lang.String concat = proc.concat("Reason");
        java.lang.Integer valueOf = java.lang.Integer.valueOf(exitInfo.getReason());
        java.util.LinkedHashMap linkedHashMap = this.f255969d;
        linkedHashMap.put(concat, valueOf);
        linkedHashMap.put(proc.concat("SubReason"), this.f255970e);
        linkedHashMap.put(proc.concat("Status"), java.lang.Integer.valueOf(exitInfo.getStatus()));
        java.lang.String concat2 = proc.concat("Description");
        java.lang.String description = exitInfo.getDescription();
        if (description == null) {
            description = "null";
        }
        linkedHashMap.put(concat2, description);
        linkedHashMap.put(proc.concat("Importance"), java.lang.Integer.valueOf(exitInfo.getImportance()));
        long j17 = 1048576;
        linkedHashMap.put(proc.concat("Pss"), java.lang.Long.valueOf((exitInfo.getPss() << 10) / j17));
        linkedHashMap.put(proc.concat("Rss"), java.lang.Long.valueOf((exitInfo.getRss() << 10) / j17));
        linkedHashMap.put(proc.concat("TimeStamp"), java.lang.Long.valueOf(exitInfo.getTimestamp()));
        linkedHashMap.put(proc.concat("ExitInfo"), exitInfo.toString());
        return jz5.f0.f302826a;
    }
}
