package l52;

/* loaded from: classes4.dex */
public final class h implements n52.e {

    /* renamed from: a, reason: collision with root package name */
    public final n52.d f316619a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f316620b;

    /* renamed from: c, reason: collision with root package name */
    public final int f316621c;

    /* renamed from: d, reason: collision with root package name */
    public int f316622d;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Class f316626h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.reflect.Field f316627i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.reflect.Field f316628j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.reflect.Method f316629k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.reflect.Field f316630l;

    /* renamed from: e, reason: collision with root package name */
    public int f316623e = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f316624f = -1;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f316625g = "";

    /* renamed from: m, reason: collision with root package name */
    public int f316631m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f316632n = 0;

    public h(n52.d dVar, java.lang.String str) {
        this.f316619a = dVar;
        this.f316620b = str;
        try {
            this.f316621c = android.view.ViewConfiguration.get(com.tencent.mm.sdk.platformtools.x2.f193071a).getScaledTouchSlop();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.HellSpeedChecker", e17, "init crash: %s", e17.getMessage());
        }
        java.lang.String str2 = this.f316620b;
        if (!kotlin.jvm.internal.o.b(str2, "SnsTimelineUI")) {
            kotlin.jvm.internal.o.b(str2, "ChattingUIFragment");
            return;
        }
        try {
            this.f316626h = com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder.class;
            java.lang.reflect.Field declaredField = com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder.class.getDeclaredField("timeLineObject");
            this.f316627i = declaredField;
            if (declaredField != null) {
                declaredField.setAccessible(true);
            }
            java.lang.reflect.Field declaredField2 = com.tencent.mm.protocal.protobuf.TimeLineObject.class.getDeclaredField("Id");
            this.f316628j = declaredField2;
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.HellSpeedChecker", e18, "initSns crash-1: %s", e18.getMessage());
        }
        try {
            java.lang.String str3 = com.tencent.mm.plugin.sns.storage.SnsInfo.TABLEINDEXUSERNAME;
            java.lang.reflect.Method declaredMethod = com.tencent.mm.plugin.sns.storage.SnsInfo.class.getDeclaredMethod("getTimeLine", new java.lang.Class[0]);
            this.f316629k = declaredMethod;
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
            }
            java.lang.reflect.Field declaredField3 = com.tencent.mm.protocal.protobuf.TimeLineObject.class.getDeclaredField("Id");
            this.f316630l = declaredField3;
            if (declaredField3 == null) {
                return;
            }
            declaredField3.setAccessible(true);
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.HellSpeedChecker", e19, "initSns crash-2: %s", e19.getMessage());
        }
    }

    @Override // n52.e
    public void a(android.view.View view, int i17) {
        n52.d dVar;
        if (view == null) {
            return;
        }
        this.f316622d = i17;
        if (i17 == 0 && (dVar = this.f316619a) != null) {
            dVar.a(view, i17, this.f316631m, this.f316632n);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00d5, code lost:
    
        if (r5 != null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x017e, code lost:
    
        if (r12.f316622d != 0) goto L117;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008a  */
    @Override // n52.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(android.view.View r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l52.h.b(android.view.View, int, int):void");
    }
}
