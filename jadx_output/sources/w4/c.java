package w4;

/* loaded from: classes13.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final x.b f442831a;

    /* renamed from: b, reason: collision with root package name */
    public final x.b f442832b;

    /* renamed from: c, reason: collision with root package name */
    public final x.b f442833c;

    public c(x.b bVar, x.b bVar2, x.b bVar3) {
        this.f442831a = bVar;
        this.f442832b = bVar2;
        this.f442833c = bVar3;
    }

    public abstract w4.c a();

    public final java.lang.Class b(java.lang.Class cls) {
        java.lang.String name = cls.getName();
        x.b bVar = this.f442833c;
        java.lang.Class cls2 = (java.lang.Class) bVar.getOrDefault(name, null);
        if (cls2 != null) {
            return cls2;
        }
        java.lang.Class<?> cls3 = java.lang.Class.forName(java.lang.String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        bVar.put(cls.getName(), cls3);
        return cls3;
    }

    public final java.lang.reflect.Method c(java.lang.String str) {
        x.b bVar = this.f442831a;
        java.lang.reflect.Method method = (java.lang.reflect.Method) bVar.getOrDefault(str, null);
        if (method != null) {
            return method;
        }
        java.lang.System.currentTimeMillis();
        java.lang.reflect.Method declaredMethod = java.lang.Class.forName(str, true, w4.c.class.getClassLoader()).getDeclaredMethod("read", w4.c.class);
        bVar.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.reflect.Method d(java.lang.Class cls) {
        java.lang.String name = cls.getName();
        x.b bVar = this.f442832b;
        java.lang.reflect.Method method = (java.lang.reflect.Method) bVar.getOrDefault(name, null);
        if (method != null) {
            return method;
        }
        java.lang.Class b17 = b(cls);
        java.lang.System.currentTimeMillis();
        java.lang.reflect.Method declaredMethod = b17.getDeclaredMethod("write", cls, w4.c.class);
        bVar.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i17);

    public int f(int i17, int i18) {
        return !e(i18) ? i17 : ((w4.d) this).f442835e.readInt();
    }

    public android.os.Parcelable g(android.os.Parcelable parcelable, int i17) {
        if (!e(i17)) {
            return parcelable;
        }
        return ((w4.d) this).f442835e.readParcelable(w4.d.class.getClassLoader());
    }

    public w4.e h() {
        java.lang.String readString = ((w4.d) this).f442835e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (w4.e) c(readString).invoke(null, a());
        } catch (java.lang.ClassNotFoundException e17) {
            throw new java.lang.RuntimeException("VersionedParcel encountered ClassNotFoundException", e17);
        } catch (java.lang.IllegalAccessException e18) {
            throw new java.lang.RuntimeException("VersionedParcel encountered IllegalAccessException", e18);
        } catch (java.lang.NoSuchMethodException e19) {
            throw new java.lang.RuntimeException("VersionedParcel encountered NoSuchMethodException", e19);
        } catch (java.lang.reflect.InvocationTargetException e27) {
            if (e27.getCause() instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) e27.getCause());
            }
            throw new java.lang.RuntimeException("VersionedParcel encountered InvocationTargetException", e27);
        }
    }

    public abstract void i(int i17);

    public void j(int i17, int i18) {
        i(i18);
        ((w4.d) this).f442835e.writeInt(i17);
    }

    public void k(android.os.Parcelable parcelable, int i17) {
        i(i17);
        ((w4.d) this).f442835e.writeParcelable(parcelable, 0);
    }

    public void l(w4.e eVar) {
        if (eVar == null) {
            ((w4.d) this).f442835e.writeString(null);
            return;
        }
        try {
            ((w4.d) this).f442835e.writeString(b(eVar.getClass()).getName());
            w4.c a17 = a();
            try {
                d(eVar.getClass()).invoke(null, eVar, a17);
                w4.d dVar = (w4.d) a17;
                int i17 = dVar.f442839i;
                if (i17 >= 0) {
                    int i18 = dVar.f442834d.get(i17);
                    android.os.Parcel parcel = dVar.f442835e;
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i18);
                    parcel.writeInt(dataPosition - i18);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (java.lang.ClassNotFoundException e17) {
                throw new java.lang.RuntimeException("VersionedParcel encountered ClassNotFoundException", e17);
            } catch (java.lang.IllegalAccessException e18) {
                throw new java.lang.RuntimeException("VersionedParcel encountered IllegalAccessException", e18);
            } catch (java.lang.NoSuchMethodException e19) {
                throw new java.lang.RuntimeException("VersionedParcel encountered NoSuchMethodException", e19);
            } catch (java.lang.reflect.InvocationTargetException e27) {
                if (!(e27.getCause() instanceof java.lang.RuntimeException)) {
                    throw new java.lang.RuntimeException("VersionedParcel encountered InvocationTargetException", e27);
                }
                throw ((java.lang.RuntimeException) e27.getCause());
            }
        } catch (java.lang.ClassNotFoundException e28) {
            throw new java.lang.RuntimeException(eVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e28);
        }
    }
}
