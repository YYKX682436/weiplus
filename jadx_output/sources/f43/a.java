package f43;

/* loaded from: classes13.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final android.database.DataSetObservable f259536a = new android.database.DataSetObservable();

    public android.view.View a(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2;
        f43.b bVar;
        f43.b bVar2;
        java.lang.Class cls;
        if (view == null) {
            f43.h hVar = (f43.h) this;
            if (hVar.f259542b == null) {
                hVar.f259542b = android.view.LayoutInflater.from(viewGroup.getContext());
            }
            int i18 = hVar.f259543c.get(0, org.chromium.net.NetError.ERR_CACHE_OPEN_FAILURE);
            f43.b bVar3 = null;
            android.view.View inflate = i18 != -404 ? hVar.f259542b.inflate(i18, viewGroup, false) : null;
            java.lang.Class cls2 = null;
            for (java.lang.Class<?> cls3 = hVar.getClass(); cls2 == null && cls3 != null; cls3 = cls3.getSuperclass()) {
                java.lang.reflect.Type genericSuperclass = cls3.getGenericSuperclass();
                if (genericSuperclass instanceof java.lang.reflect.ParameterizedType) {
                    for (java.lang.reflect.Type type : ((java.lang.reflect.ParameterizedType) genericSuperclass).getActualTypeArguments()) {
                        if (type instanceof java.lang.Class) {
                            cls = (java.lang.Class) type;
                            if (f43.b.class.isAssignableFrom(cls)) {
                                cls2 = cls;
                                break;
                            }
                        } else {
                            if (type instanceof java.lang.reflect.ParameterizedType) {
                                java.lang.reflect.Type rawType = ((java.lang.reflect.ParameterizedType) type).getRawType();
                                if (rawType instanceof java.lang.Class) {
                                    cls = (java.lang.Class) rawType;
                                    if (f43.b.class.isAssignableFrom(cls)) {
                                        cls2 = cls;
                                        break;
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                cls2 = null;
            }
            if (cls2 == null) {
                bVar = new f43.b(inflate);
            } else {
                try {
                    if (!cls2.isMemberClass() || java.lang.reflect.Modifier.isStatic(cls2.getModifiers())) {
                        java.lang.reflect.Constructor declaredConstructor = cls2.getDeclaredConstructor(android.view.View.class);
                        declaredConstructor.setAccessible(true);
                        bVar2 = (f43.b) declaredConstructor.newInstance(inflate);
                    } else {
                        java.lang.reflect.Constructor declaredConstructor2 = cls2.getDeclaredConstructor(hVar.getClass(), android.view.View.class);
                        declaredConstructor2.setAccessible(true);
                        bVar2 = (f43.b) declaredConstructor2.newInstance(hVar, inflate);
                    }
                    bVar3 = bVar2;
                } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
                }
                bVar = bVar3;
            }
            if (bVar == null) {
                bVar = new f43.b(inflate);
            }
            view2 = bVar.f259537a;
            view2.setTag(bVar);
        } else {
            view2 = view;
            bVar = (f43.b) view.getTag();
        }
        bVar.f259538b = 0;
        p33.i0 i0Var = (p33.i0) ((f43.h) this).f259544d.get(i17);
        if (i0Var != null) {
            ((android.widget.TextView) bVar.f259537a.findViewById(com.tencent.mm.R.id.oqu)).setText(i0Var.f351593e);
        }
        return view2;
    }
}
