package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes3.dex */
public final class w2 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public int f173170d;

    /* renamed from: e, reason: collision with root package name */
    public int f173171e;

    /* renamed from: f, reason: collision with root package name */
    public long f173172f;

    /* renamed from: g, reason: collision with root package name */
    public int f173173g;

    /* renamed from: h, reason: collision with root package name */
    public r45.kz2 f173174h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f173173g = -1;
        this.f173174h = new r45.kz2();
    }

    public final void O6() {
        r45.lz2 lz2Var;
        r45.lz2 lz2Var2;
        java.lang.String string;
        java.lang.String string2;
        android.widget.TextView textView = (android.widget.TextView) getActivity().findViewById(com.tencent.mm.R.id.nzn);
        android.widget.TextView textView2 = (android.widget.TextView) getActivity().findViewById(com.tencent.mm.R.id.o0l);
        if (this.f173170d > 0 && this.f173171e >= 0) {
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            calendar.set(5, 1);
            java.util.Calendar calendar2 = java.util.Calendar.getInstance();
            calendar2.set(5, 1);
            calendar2.set(1, this.f173170d);
            calendar2.set(2, this.f173171e);
            int i17 = calendar.get(1) - calendar2.get(1);
            int i18 = calendar.get(2) - calendar2.get(2);
            if (i17 >= 0 && i17 < 100) {
                this.f173173g = i17;
                if (i18 < 0) {
                    this.f173173g = java.lang.Math.max(i17 - 1, 0);
                }
            } else if (i17 == 100 && i18 < 0) {
                this.f173173g = java.lang.Math.max(i17 - 1, 0);
            }
        }
        int i19 = this.f173173g;
        java.lang.String str = "";
        if (i19 > 0) {
            textView.setText(i19 >= 18 ? getActivity().getString(com.tencent.mm.R.string.js9) : getActivity().getString(com.tencent.mm.R.string.js8, java.lang.Integer.valueOf(this.f173173g)));
        } else if (i19 == 0) {
            textView.setText(com.tencent.mm.R.string.js_);
        } else {
            textView.setText("");
        }
        int i27 = this.f173173g;
        if (i27 < 0) {
            i27 = 10;
        }
        if (i27 < 0 || this.f173174h.getList(2).size() <= 0) {
            textView2.setText(com.tencent.mm.R.string.js6);
            return;
        }
        java.util.Iterator it = this.f173174h.getList(2).iterator();
        while (true) {
            if (!it.hasNext()) {
                lz2Var = null;
                break;
            }
            lz2Var = (r45.lz2) it.next();
            if (i27 >= lz2Var.getInteger(0) && i27 <= lz2Var.getInteger(1)) {
                break;
            }
        }
        if (lz2Var == null) {
            java.util.LinkedList list = this.f173174h.getList(2);
            kotlin.jvm.internal.o.f(list, "getVisible_info(...)");
            lz2Var2 = (r45.lz2) kz5.n0.Z(list);
        } else {
            lz2Var2 = lz2Var;
        }
        if (lz2Var2 != null) {
            if (this.f173172f == 0) {
                textView2.setText(com.tencent.mm.R.string.js6);
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it6 = lz2Var2.getList(2).iterator();
                while (it6.hasNext()) {
                    r45.mz2 mz2Var = (r45.mz2) it6.next();
                    if ((this.f173172f & mz2Var.getLong(0)) > 0) {
                        arrayList.add(mz2Var);
                    }
                }
                if (arrayList.size() == 0) {
                    textView2.setText(com.tencent.mm.R.string.js6);
                } else if (arrayList.size() == 1) {
                    r45.mz2 mz2Var2 = (r45.mz2) kz5.n0.Z(arrayList);
                    if (mz2Var2 != null && (string2 = mz2Var2.getString(1)) != null) {
                        str = string2;
                    }
                    textView2.setText(str);
                } else {
                    androidx.appcompat.app.AppCompatActivity activity = getActivity();
                    java.lang.Object[] objArr = new java.lang.Object[2];
                    r45.mz2 mz2Var3 = (r45.mz2) kz5.n0.Z(arrayList);
                    if (mz2Var3 != null && (string = mz2Var3.getString(1)) != null) {
                        str = string;
                    }
                    objArr[0] = str;
                    objArr[1] = java.lang.Integer.valueOf(arrayList.size());
                    textView2.setText(activity.getString(com.tencent.mm.R.string.js7, objArr));
                }
            }
        }
        if (lz2Var == null) {
            com.tencent.mars.xlog.Log.e("FinderTeenModeContentManageUIC", "updateSelectedContentText: can not find visible info of this age=%d, info size=%d", java.lang.Integer.valueOf(this.f173173g), java.lang.Integer.valueOf(this.f173174h.getList(2).size()));
        }
    }
}
