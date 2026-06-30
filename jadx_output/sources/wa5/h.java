package wa5;

/* loaded from: classes14.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f444319a;

    /* renamed from: b, reason: collision with root package name */
    public final wa5.j f444320b;

    public h(androidx.appcompat.app.AppCompatActivity activity, wa5.j uic) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(uic, "uic");
        this.f444319a = activity;
        this.f444320b = uic;
    }

    public static android.os.Bundle a(wa5.h hVar, android.view.View view, wa5.a aVar, android.content.Intent intent, int i17, java.lang.Object obj) {
        android.util.Pair[] pairArr;
        android.os.ResultReceiver resultReceiver;
        java.lang.String str;
        jz5.f0 f0Var = null;
        if ((i17 & 2) != 0) {
            aVar = null;
        }
        if ((i17 & 4) != 0) {
            intent = null;
        }
        if (hVar.f444320b.f444325f) {
            return null;
        }
        wa5.d dVar = wa5.d.f444315a;
        java.util.List<android.util.Pair> a17 = view != null ? wa5.e.a(view) : null;
        androidx.appcompat.app.AppCompatActivity appCompatActivity = hVar.f444319a;
        java.util.Objects.toString(appCompatActivity);
        java.util.Objects.toString(a17);
        if (!(appCompatActivity instanceof android.app.Activity)) {
            return null;
        }
        dVar.b(appCompatActivity, false, aVar);
        dVar.c(appCompatActivity);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (a17 != null) {
            for (android.util.Pair pair : a17) {
                arrayList.add(new m3.d(pair.first, pair.second));
            }
        }
        m3.d[] dVarArr = (m3.d[]) arrayList.toArray(new m3.d[0]);
        m3.d[] dVarArr2 = (m3.d[]) java.util.Arrays.copyOf(dVarArr, dVarArr.length);
        if (dVarArr2 != null) {
            pairArr = new android.util.Pair[dVarArr2.length];
            for (int i18 = 0; i18 < dVarArr2.length; i18++) {
                m3.d dVar2 = dVarArr2[i18];
                pairArr[i18] = android.util.Pair.create((android.view.View) dVar2.f323092a, (java.lang.String) dVar2.f323093b);
            }
        } else {
            pairArr = null;
        }
        android.os.Bundle bundle = z2.k.b(appCompatActivity, pairArr).toBundle();
        if (bundle != null) {
            try {
                resultReceiver = (android.os.ResultReceiver) bundle.getParcelable("android:activity.transitionCompleteListener");
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MM.Transition", th6, "getEnter err", new java.lang.Object[0]);
                str = "err";
            }
        } else {
            resultReceiver = null;
        }
        if (!(resultReceiver instanceof android.os.ResultReceiver)) {
            resultReceiver = null;
        }
        if (resultReceiver != null) {
            wa5.d.f444315a.a(appCompatActivity).f444311c.add(new java.lang.ref.WeakReference(resultReceiver));
            str = "isNotNull:" + resultReceiver;
            f0Var = jz5.f0.f302826a;
        } else {
            str = "default";
        }
        if (f0Var == null) {
            str = "isNull";
        }
        com.tencent.mars.xlog.Log.i("MM.Transition", "initOptionBundle act:" + appCompatActivity + ", coordinator:" + str);
        dVar.a(appCompatActivity).f444312d = new java.lang.ref.WeakReference(aVar);
        if (intent != null) {
            intent.putExtra("KEY_EXIT_ACTIVITY", appCompatActivity.hashCode());
        }
        return bundle;
    }
}
