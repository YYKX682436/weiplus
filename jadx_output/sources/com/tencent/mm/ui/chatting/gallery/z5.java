package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes14.dex */
public class z5 extends wa5.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryUI f201609b;

    public z5(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI) {
        this.f201609b = imageGalleryUI;
    }

    public final void b(java.util.List list, java.util.List list2, java.util.List list3) {
        if (list2 == null || list3 == null || list2.size() != list3.size()) {
            return;
        }
        for (int i17 = 0; i17 < list2.size(); i17++) {
            android.view.View view = (android.view.View) list2.get(i17);
            android.view.View view2 = (android.view.View) list3.get(i17);
            if ((view instanceof android.widget.ImageView) && (view2 instanceof android.widget.ImageView)) {
                android.widget.ImageView imageView = (android.widget.ImageView) view;
                android.widget.ImageView imageView2 = (android.widget.ImageView) view2;
                if (imageView2.getDrawable() != null) {
                    imageView.setImageDrawable(imageView2.getDrawable());
                }
            }
        }
    }

    @Override // wa5.a, android.app.SharedElementCallback
    public void onMapSharedElements(java.util.List list, java.util.Map map) {
        androidx.lifecycle.o mo133getLifecycle;
        if (list != null && map != null) {
            list.clear();
            map.clear();
        }
        java.util.Objects.toString(list);
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f201609b;
        if (((wa5.j) imageGalleryUI.component(wa5.j.class)).f444326g) {
            wa5.j jVar = (wa5.j) imageGalleryUI.component(wa5.j.class);
            jVar.getClass();
            wa5.d dVar = wa5.d.f444315a;
            androidx.appcompat.app.AppCompatActivity activity = jVar.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            int intExtra = activity.getIntent().getIntExtra("KEY_EXIT_ACTIVITY", 0);
            wa5.a aVar = null;
            if (intExtra != 0) {
                java.util.Set entrySet = wa5.d.f444316b.entrySet();
                kotlin.jvm.internal.o.f(entrySet, "<get-entries>(...)");
                java.util.Iterator it = entrySet.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                    if (((android.app.Activity) entry.getKey()).hashCode() == intExtra) {
                        java.lang.Object key = entry.getKey();
                        androidx.appcompat.app.AppCompatActivity appCompatActivity = key instanceof androidx.appcompat.app.AppCompatActivity ? (androidx.appcompat.app.AppCompatActivity) key : null;
                        androidx.lifecycle.n b17 = (appCompatActivity == null || (mo133getLifecycle = appCompatActivity.mo133getLifecycle()) == null) ? null : mo133getLifecycle.b();
                        androidx.lifecycle.o mo133getLifecycle2 = activity.mo133getLifecycle();
                        androidx.lifecycle.n b18 = mo133getLifecycle2 != null ? mo133getLifecycle2.b() : null;
                        entry.getKey().getClass();
                        java.util.Objects.toString(b17);
                        java.util.Objects.toString(b18);
                        java.lang.ref.WeakReference weakReference = ((wa5.b) entry.getValue()).f444312d;
                        if (weakReference != null) {
                            aVar = (wa5.a) weakReference.get();
                        }
                    }
                }
            }
            if (aVar != null) {
                aVar.a(list, map);
            }
            for (java.util.Map.Entry entry2 : map.entrySet()) {
                if (entry2.getValue() instanceof ya5.a) {
                    ((ya5.a) entry2.getValue()).q();
                }
            }
        }
        java.util.Objects.toString(list);
        super.onMapSharedElements(list, map);
    }

    @Override // wa5.a, android.app.SharedElementCallback
    public void onSharedElementEnd(java.util.List list, java.util.List list2, java.util.List list3) {
        b(list, list2, list3);
        super.onSharedElementEnd(list, list2, list3);
    }

    @Override // wa5.a, android.app.SharedElementCallback
    public void onSharedElementStart(java.util.List list, java.util.List list2, java.util.List list3) {
        b(list, list2, list3);
        super.onSharedElementStart(list, list2, list3);
    }
}
