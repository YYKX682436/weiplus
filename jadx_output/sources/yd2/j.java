package yd2;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public yz5.l f461074b;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f461073a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f461075c = new java.util.concurrent.ConcurrentHashMap();

    public j() {
        e("debug::echo", "1.0.0", zd2.a.f471591a, com.tencent.mm.plugin.finder.live.aiassistant.tools.EchoParams.class);
        e("camera::flip", "1.0.0", zd2.b.f471592a, com.tencent.mm.plugin.finder.live.aiassistant.tools.FlipCameraParams.class);
        e("lottery::create", "1.0.0", zd2.d.f471600a, com.tencent.mm.plugin.finder.live.aiassistant.tools.LotteryCreateParams.class);
    }

    public static final /* synthetic */ java.lang.String a(yd2.j jVar) {
        jVar.getClass();
        return "Finder.Live.AiAssistant.ToolManager";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v4 */
    public static final yd2.l b(yd2.j jVar, java.lang.Class cls, java.lang.String str) {
        java.lang.reflect.Field[] fieldArr;
        java.lang.reflect.Field[] fieldArr2;
        jVar.getClass();
        ?? r37 = 0;
        yd2.l lVar = (yd2.l) cls.getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        boolean z17 = true;
        if (str == null || str.length() == 0) {
            kotlin.jvm.internal.o.d(lVar);
        } else {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
                kotlin.jvm.internal.o.f(declaredFields, "getDeclaredFields(...)");
                int length = declaredFields.length;
                int i17 = 0;
                while (i17 < length) {
                    java.lang.reflect.Field field = declaredFields[i17];
                    java.lang.String name = field.getName();
                    if (jSONObject.has(name)) {
                        field.setAccessible(z17);
                        java.lang.Class<?> type = field.getType();
                        if (kotlin.jvm.internal.o.b(type, java.lang.Integer.TYPE)) {
                            field.setInt(lVar, jSONObject.getInt(name));
                        } else if (kotlin.jvm.internal.o.b(type, java.lang.Integer.class)) {
                            java.lang.Object opt = jSONObject.opt(name);
                            if (opt != null && !kotlin.jvm.internal.o.b(opt, org.json.JSONObject.NULL)) {
                                field.set(lVar, java.lang.Integer.valueOf(jSONObject.optInt(name, r37)));
                            }
                        } else {
                            if (kotlin.jvm.internal.o.b(type, java.lang.Boolean.class) ? z17 : kotlin.jvm.internal.o.b(type, java.lang.Boolean.TYPE)) {
                                field.setBoolean(lVar, jSONObject.optBoolean(name, r37));
                            } else if (kotlin.jvm.internal.o.b(type, java.lang.String.class)) {
                                java.lang.Object opt2 = jSONObject.opt(name);
                                if (opt2 != null && !kotlin.jvm.internal.o.b(opt2, org.json.JSONObject.NULL)) {
                                    field.set(lVar, opt2.toString());
                                }
                            } else {
                                if (!(kotlin.jvm.internal.o.b(type, java.util.List.class) ? z17 : kotlin.jvm.internal.o.b(type, java.util.ArrayList.class))) {
                                    com.tencent.mars.xlog.Log.e("AiAssistantTool", "Unsupported param type: " + field.getType().getSimpleName() + " for " + field.getName());
                                    throw new java.lang.IllegalArgumentException("Unsupported param type: " + field.getType().getSimpleName() + " for " + field.getName());
                                }
                                org.json.JSONArray optJSONArray = jSONObject.optJSONArray(name);
                                if (optJSONArray != null) {
                                    java.util.ArrayList arrayList = new java.util.ArrayList();
                                    int length2 = optJSONArray.length();
                                    int i18 = r37;
                                    while (i18 < length2) {
                                        java.lang.Object opt3 = optJSONArray.opt(i18);
                                        if (opt3 instanceof org.json.JSONObject) {
                                            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                                            java.util.Iterator<java.lang.String> keys = ((org.json.JSONObject) opt3).keys();
                                            kotlin.jvm.internal.o.f(keys, "keys(...)");
                                            while (keys.hasNext()) {
                                                java.lang.String next = keys.next();
                                                kotlin.jvm.internal.o.d(next);
                                                linkedHashMap.put(next, ((org.json.JSONObject) opt3).opt(next));
                                                declaredFields = declaredFields;
                                            }
                                            fieldArr2 = declaredFields;
                                            arrayList.add(linkedHashMap);
                                        } else {
                                            fieldArr2 = declaredFields;
                                            if (opt3 != null && !kotlin.jvm.internal.o.b(opt3, org.json.JSONObject.NULL)) {
                                                arrayList.add(opt3);
                                            }
                                        }
                                        i18++;
                                        declaredFields = fieldArr2;
                                    }
                                    fieldArr = declaredFields;
                                    field.set(lVar, arrayList);
                                    i17++;
                                    declaredFields = fieldArr;
                                    r37 = 0;
                                    z17 = true;
                                }
                            }
                        }
                    }
                    fieldArr = declaredFields;
                    i17++;
                    declaredFields = fieldArr;
                    r37 = 0;
                    z17 = true;
                }
                kotlin.jvm.internal.o.d(lVar);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("Finder.Live.AiAssistant.ToolManager", "parseArguments: failed to parse arguments: " + e17.getMessage());
                throw new java.lang.IllegalArgumentException("Failed to parse tool arguments: " + e17.getMessage(), e17);
            }
        }
        return lVar;
    }

    public final r45.mf1 c(yd2.b bVar, java.lang.String str, boolean z17, java.lang.String str2, int i17) {
        r45.mf1 mf1Var = new r45.mf1();
        mf1Var.set(0, bVar.f461031c);
        mf1Var.set(1, java.lang.Long.valueOf(bVar.f461032d));
        mf1Var.set(3, str);
        mf1Var.set(4, java.lang.Boolean.valueOf(z17));
        if (str2 == null) {
            str2 = "";
        }
        mf1Var.set(5, str2);
        mf1Var.set(6, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        return mf1Var;
    }

    public final void d(java.util.List toolCalls, yd2.b context, kotlinx.coroutines.y0 scope, yz5.l onAllComplete) {
        kotlin.jvm.internal.o.g(toolCalls, "toolCalls");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(onAllComplete, "onAllComplete");
        if (toolCalls.isEmpty()) {
            onAllComplete.invoke(kz5.p0.f313996d);
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.Live.AiAssistant.ToolManager", "handleToolCalls: " + toolCalls.size() + " calls, sessionId=" + context.f461031c);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = toolCalls.iterator();
        while (it.hasNext()) {
            yd2.n nVar = (yd2.n) it.next();
            java.lang.String str = nVar.f461079b + '@' + nVar.f461080c;
            yd2.a aVar = (yd2.a) this.f461073a.get(str);
            if (aVar == null) {
                java.lang.String str2 = nVar.f461078a;
                concurrentHashMap.put(str2, c(context, str2, false, "{\"error\":\"tool not found: " + str + "\"}", 1001));
            } else {
                arrayList.add(kotlinx.coroutines.l.d(scope, null, null, new yd2.f(context, nVar, aVar, concurrentHashMap, this, str, null), 3, null));
            }
        }
        kotlinx.coroutines.l.d(scope, null, null, new yd2.c(arrayList, toolCalls, this, onAllComplete, concurrentHashMap, null), 3, null);
    }

    public final void e(java.lang.String str, java.lang.String str2, yd2.a aVar, java.lang.Class cls) {
        java.lang.String str3 = str + '@' + str2;
        this.f461073a.put(str3, aVar);
        this.f461075c.put(str3, cls);
    }
}
