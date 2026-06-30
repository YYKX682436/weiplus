package ku3;

/* loaded from: classes10.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.i0 f312420d;

    public u(ku3.i0 i0Var) {
        this.f312420d = i0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        androidx.recyclerview.widget.f2 adapter;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitMenuPlugin$initLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ku3.i0 i0Var = this.f312420d;
        if (i0Var.f312251d.N6(10) == 0) {
            zt3.a.U6(i0Var.f312251d, 10, 4, null, 4, null);
        } else {
            zt3.a aVar = i0Var.f312251d;
            if (aVar.f475583n) {
                z17 = false;
            } else {
                java.util.HashMap hashMap = aVar.f475578f;
                z17 = true;
                hashMap.put(java.lang.Integer.valueOf(hashMap.size()), 1);
                java.util.HashMap hashMap2 = aVar.f475579g;
                hashMap2.put(1, new androidx.lifecycle.j0());
                bs0.j jVar = aVar.f475577e;
                if (jVar.c(1) == 1) {
                    hashMap.put(java.lang.Integer.valueOf(hashMap.size()), 2);
                    hashMap2.put(2, new androidx.lifecycle.j0());
                }
                if (jVar.c(2) == 1) {
                    hashMap.put(java.lang.Integer.valueOf(hashMap.size()), 3);
                    hashMap2.put(3, new androidx.lifecycle.j0());
                }
                if (jVar.c(3) == 1) {
                    hashMap.put(java.lang.Integer.valueOf(hashMap.size()), 4);
                    hashMap2.put(4, new androidx.lifecycle.j0());
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkSupportFilter >> ");
                boolean z18 = aVar.f475584o;
                sb6.append(z18);
                com.tencent.mars.xlog.Log.i("MicroMsg.CameraKit.Context", sb6.toString());
                if (z18) {
                    hashMap.put(java.lang.Integer.valueOf(hashMap.size()), 5);
                    hashMap2.put(5, new androidx.lifecycle.j0());
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.CameraKit.Context", "checkSupportBeauty >> " + z18);
                if (z18) {
                    hashMap.put(java.lang.Integer.valueOf(hashMap.size()), 6);
                    hashMap2.put(6, new androidx.lifecycle.j0());
                }
                hashMap.put(java.lang.Integer.valueOf(hashMap.size()), 7);
                hashMap2.put(7, new androidx.lifecycle.j0());
                hashMap.put(java.lang.Integer.valueOf(hashMap.size()), 8);
                hashMap2.put(8, new androidx.lifecycle.j0());
                hashMap.put(java.lang.Integer.valueOf(hashMap.size()), 9);
                hashMap2.put(9, new androidx.lifecycle.j0());
                aVar.f475583n = true;
                aVar.f475582m.postValue(new zt3.b(1, null));
            }
            if (z17 && (adapter = i0Var.a().getAdapter()) != null) {
                adapter.notifyDataSetChanged();
            }
            zt3.a.U6(i0Var.f312251d, 10, 0, null, 4, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitMenuPlugin$initLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
