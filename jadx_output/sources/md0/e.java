package md0;

@j95.b
/* loaded from: classes4.dex */
public final class e extends i95.w implements nd0.e {
    public com.tencent.mm.protobuf.f Ai(android.content.Context context, int i17, java.lang.Class clazz) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(clazz, "clazz");
        t04.a aVar = context instanceof com.tencent.mm.ui.component.UIComponentActivity ? (t04.a) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(t04.a.class) : null;
        o04.o Q6 = aVar != null ? aVar.Q6(i17) : null;
        if (Q6 == null) {
            Q6 = new o04.i(clazz, i17);
            t04.a aVar2 = context instanceof com.tencent.mm.ui.component.UIComponentActivity ? (t04.a) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(t04.a.class) : null;
            if (aVar2 != null) {
                aVar2.T6(Q6);
            }
        }
        com.tencent.mm.protobuf.f c17 = Q6.c();
        if (c17 instanceof com.tencent.mm.protobuf.f) {
            return c17;
        }
        return null;
    }

    public o04.n Bi(android.content.Context context, int i17) {
        t04.a aVar;
        kotlin.jvm.internal.o.g(context, "context");
        if (context instanceof com.tencent.mm.ui.component.UIComponentActivity) {
            aVar = (t04.a) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(t04.a.class);
        } else {
            aVar = null;
        }
        if (aVar != null) {
            return aVar.O6(i17);
        }
        return null;
    }

    public com.tencent.mm.protobuf.f Di(android.content.Context context, java.lang.String activityName, int i17, java.lang.Class clazz) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(activityName, "activityName");
        kotlin.jvm.internal.o.g(clazz, "clazz");
        t04.a aVar = context instanceof com.tencent.mm.ui.component.UIComponentActivity ? (t04.a) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(t04.a.class) : null;
        o04.o Q6 = aVar != null ? aVar.Q6(i17) : null;
        if (Q6 == null) {
            Q6 = new o04.a(activityName, clazz, i17, false);
            t04.a aVar2 = context instanceof com.tencent.mm.ui.component.UIComponentActivity ? (t04.a) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(t04.a.class) : null;
            if (aVar2 != null) {
                aVar2.T6(Q6);
            }
        }
        com.tencent.mm.protobuf.f c17 = Q6.c();
        if (c17 instanceof com.tencent.mm.protobuf.f) {
            return c17;
        }
        return null;
    }

    public com.tencent.mm.protobuf.f Ni(android.content.Context context, int i17, int i18, java.lang.Class clazz) {
        t04.a aVar;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(clazz, "clazz");
        if (context instanceof com.tencent.mm.ui.component.UIComponentActivity) {
            aVar = (t04.a) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(t04.a.class);
        } else {
            aVar = null;
        }
        if (aVar != null) {
            return aVar.P6(i17, i18, clazz);
        }
        return null;
    }

    public com.tencent.mm.protobuf.f Ri(android.content.Context context, int i17, int i18, java.lang.Class clazz) {
        t04.a aVar;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(clazz, "clazz");
        if (context instanceof com.tencent.mm.ui.component.UIComponentActivity) {
            aVar = (t04.a) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(t04.a.class);
        } else {
            aVar = null;
        }
        if (aVar != null) {
            return aVar.P6(i17, i18, clazz);
        }
        return null;
    }

    public com.tencent.mm.protobuf.f Ui(android.content.Context context, int i17, java.lang.Class clazz) {
        o04.o Q6;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(clazz, "clazz");
        t04.a aVar = context instanceof com.tencent.mm.ui.component.UIComponentActivity ? (t04.a) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(t04.a.class) : null;
        com.tencent.mm.protobuf.f c17 = (aVar == null || (Q6 = aVar.Q6(i17)) == null) ? null : Q6.c();
        if (c17 instanceof com.tencent.mm.protobuf.f) {
            return c17;
        }
        return null;
    }

    public com.tencent.mm.protobuf.f Vi(int i17, android.view.View view) {
        o04.n O6;
        kotlin.jvm.internal.o.g(view, "view");
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.protobuf.f fVar = null;
        t04.a aVar = context instanceof com.tencent.mm.ui.component.UIComponentActivity ? (t04.a) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(t04.a.class) : null;
        java.util.HashMap hashMap = (aVar == null || (O6 = aVar.O6(i17)) == null) ? null : (java.util.HashMap) ((jz5.n) ((o04.g) O6).f341909b).getValue();
        if (hashMap != null && hashMap.containsKey(java.lang.String.valueOf(view.hashCode()))) {
            return (com.tencent.mm.protobuf.f) hashMap.get(java.lang.String.valueOf(view.hashCode()));
        }
        android.view.ViewParent parent = view.getParent();
        while (parent != null) {
            if (hashMap != null && hashMap.containsKey(java.lang.String.valueOf(parent.hashCode()))) {
                break;
            }
            parent = parent.getParent();
        }
        if (hashMap != null) {
            fVar = (com.tencent.mm.protobuf.f) hashMap.get(java.lang.String.valueOf(parent != null ? parent.hashCode() : 0));
        }
        return fVar;
    }

    public void Zi(android.content.Context context, o04.o secData) {
        t04.a aVar;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(secData, "secData");
        if (context instanceof com.tencent.mm.ui.component.UIComponentActivity) {
            aVar = (t04.a) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(t04.a.class);
        } else {
            aVar = null;
        }
        if (aVar != null) {
            aVar.T6(secData);
        }
    }

    public com.tencent.mm.protobuf.f wi(android.content.Context context, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        t04.a aVar = context instanceof com.tencent.mm.ui.component.UIComponentActivity ? (t04.a) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(t04.a.class) : null;
        if (aVar == null) {
            return null;
        }
        o04.o Q6 = aVar.Q6(i17);
        com.tencent.mm.protobuf.f c17 = Q6 != null ? Q6.c() : null;
        if (c17 instanceof com.tencent.mm.protobuf.f) {
            return c17;
        }
        return null;
    }
}
