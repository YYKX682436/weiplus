package t04;

/* loaded from: classes4.dex */
public final class a extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f414523d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.z60 f414524e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f414525f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f414526g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f414523d = "MicroMsg.SecData.SecDataUIC";
        this.f414524e = new r45.z60();
        this.f414525f = new java.util.HashMap();
        this.f414526g = new java.util.HashMap();
    }

    public final o04.n O6(int i17) {
        java.lang.Object obj = this.f414526g.get(java.lang.Integer.valueOf(i17));
        if (obj instanceof o04.n) {
            return (o04.n) obj;
        }
        return null;
    }

    public final com.tencent.mm.protobuf.f P6(int i17, int i18, java.lang.Class clazz) {
        r45.y60 y60Var;
        java.util.LinkedList linkedList;
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(clazz, "clazz");
        java.util.LinkedList linkedList2 = this.f414524e.f391745d;
        if (!(linkedList2.size() > i17)) {
            linkedList2 = null;
        }
        if (linkedList2 != null && (y60Var = (r45.y60) linkedList2.get(i17)) != null && (linkedList = y60Var.f390823i) != null) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((r45.a70) obj).f369800d == i18) {
                    break;
                }
            }
            r45.a70 a70Var = (r45.a70) obj;
            if (a70Var != null) {
                com.tencent.mm.protobuf.f fVar = (com.tencent.mm.protobuf.f) clazz.newInstance();
                fVar.parseFrom(a70Var.f369801e.g());
                return fVar;
            }
        }
        return null;
    }

    public final o04.o Q6(int i17) {
        return (o04.o) this.f414525f.get(java.lang.Integer.valueOf(i17));
    }

    public final void R6(android.content.Intent intent) {
        jz5.f0 f0Var;
        this.f414525f.clear();
        this.f414526g.clear();
        r45.z60 z60Var = this.f414524e;
        z60Var.f391745d.clear();
        try {
            byte[] byteArrayExtra = intent.getByteArrayExtra("ReportKey.CommonReportObjKey");
            if (byteArrayExtra != null) {
                z60Var.parseFrom(byteArrayExtra);
            }
        } catch (java.lang.Exception unused) {
        }
        r45.y60 y60Var = new r45.y60();
        y60Var.f390818d = getActivity().getClass().getSimpleName();
        y60Var.f390820f = c01.id.c();
        java.util.LinkedList List = z60Var.f391745d;
        kotlin.jvm.internal.o.f(List, "List");
        r45.y60 y60Var2 = (r45.y60) kz5.n0.Z(List);
        java.lang.String str = this.f414523d;
        if (y60Var2 != null) {
            y60Var.f390819e = y60Var2.f390819e;
            y60Var.f390821g = y60Var2.f390821g;
            y60Var.f390822h = 0;
            com.tencent.mars.xlog.Log.i(str, "fromPage:" + y60Var2.f390818d + " contextId:" + y60Var2.f390819e + " currentPage:" + y60Var.f390818d);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            y60Var.f390819e = java.util.UUID.randomUUID().toString();
            y60Var.f390821g = 0;
            y60Var.f390822h = 1;
            com.tencent.mars.xlog.Log.i(str, "firstPage:" + y60Var.f390818d + " contextId:" + y60Var.f390819e);
        }
        z60Var.f391745d.addFirst(y60Var);
        if (z60Var.f391745d.size() > 5) {
            z60Var.f391745d.removeLast();
        }
    }

    public final void S6(o04.n secData) {
        kotlin.jvm.internal.o.g(secData, "secData");
        this.f414526g.put(java.lang.Integer.valueOf(((o04.g) secData).f341908a), secData);
    }

    public final void T6(o04.o secData) {
        kotlin.jvm.internal.o.g(secData, "secData");
        this.f414525f.put(java.lang.Integer.valueOf(secData.getType()), secData);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateBefore(android.os.Bundle bundle) {
        super.onCreateBefore(bundle);
        R6(getIntent());
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onNewIntent(android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i(this.f414523d, "onNewIntent " + intent);
        if (intent != null) {
            if (!intent.getBooleanExtra("ReportKey.CommonReportNewIntentClearKey", false)) {
                intent = null;
            }
            if (intent != null) {
                R6(intent);
                return;
            }
        }
        android.content.Intent intent2 = getIntent();
        android.content.Intent intent3 = intent2.getBooleanExtra("ReportKey.CommonReportNewIntentClearKey", false) ? intent2 : null;
        if (intent3 != null) {
            R6(intent3);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onStartActivityForResult(android.content.Intent intent, int i17, android.os.Bundle bundle) {
        r45.z60 z60Var;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        java.util.LinkedList linkedList3;
        java.lang.String str = this.f414523d;
        try {
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.HashMap hashMap = this.f414525f;
            java.util.Collection values = hashMap.values();
            kotlin.jvm.internal.o.f(values, "<get-values>(...)");
            java.util.Iterator it = values.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                z60Var = this.f414524e;
                if (!hasNext) {
                    break;
                }
                o04.o oVar = (o04.o) it.next();
                if (oVar.b(intent)) {
                    r45.a70 a70Var = new r45.a70();
                    a70Var.f369800d = oVar.getType();
                    a70Var.f369801e = new com.tencent.mm.protobuf.g(oVar.c().toByteArray());
                    java.util.LinkedList List = z60Var.f391745d;
                    kotlin.jvm.internal.o.f(List, "List");
                    r45.y60 y60Var = (r45.y60) kz5.n0.Z(List);
                    if (y60Var != null && (linkedList3 = y60Var.f390823i) != null) {
                        linkedList3.add(a70Var);
                    }
                    if (!oVar.a()) {
                        hashSet.add(java.lang.Integer.valueOf(oVar.getType()));
                    }
                }
            }
            java.util.Iterator it6 = hashSet.iterator();
            while (it6.hasNext()) {
                hashMap.remove(java.lang.Integer.valueOf(((java.lang.Number) it6.next()).intValue()));
            }
            byte[] byteArray = z60Var.toByteArray();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("onStartActivityForResult SubObjList.size:");
            java.util.LinkedList List2 = z60Var.f391745d;
            kotlin.jvm.internal.o.f(List2, "List");
            r45.y60 y60Var2 = (r45.y60) kz5.n0.Z(List2);
            sb6.append((y60Var2 == null || (linkedList2 = y60Var2.f390823i) == null) ? null : java.lang.Integer.valueOf(linkedList2.size()));
            sb6.append(", requestCode:");
            sb6.append(i17);
            sb6.append(" options:");
            sb6.append(bundle);
            sb6.append(" byteSize:");
            sb6.append(byteArray.length);
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            if (byteArray.length > 262144) {
                int length = byteArray.length;
                java.util.LinkedList List3 = z60Var.f391745d;
                kotlin.jvm.internal.o.f(List3, "List");
                r45.y60 y60Var3 = (r45.y60) kz5.n0.Z(List3);
                if (y60Var3 != null) {
                    List3.clear();
                    List3.add(y60Var3);
                }
                byteArray = z60Var.toByteArray();
                com.tencent.mars.xlog.Log.i(str, "data size large than 256KB origin:" + com.tencent.mm.sdk.platformtools.t8.g0(length, 2.0d) + " current:" + com.tencent.mm.sdk.platformtools.t8.g0(byteArray.length, 2.0d));
            }
            if (byteArray.length >= 262144) {
                com.tencent.mars.xlog.Log.w(str, "data size two large");
            } else if (intent != null) {
                intent.putExtra("ReportKey.CommonReportObjKey", byteArray);
            }
            java.util.LinkedList List4 = z60Var.f391745d;
            kotlin.jvm.internal.o.f(List4, "List");
            r45.y60 y60Var4 = (r45.y60) kz5.n0.Z(List4);
            if (y60Var4 == null || (linkedList = y60Var4.f390823i) == null) {
                return;
            }
            linkedList.clear();
        } catch (java.lang.Exception unused) {
        }
    }
}
