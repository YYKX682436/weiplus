package o26;

/* loaded from: classes16.dex */
public class q extends java.util.AbstractList implements java.util.RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public int f342609d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f342610e;

    public static /* synthetic */ void d(int i17) {
        java.lang.String str = (i17 == 2 || i17 == 3 || i17 == 5 || i17 == 6 || i17 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i17 == 2 || i17 == 3 || i17 == 5 || i17 == 6 || i17 == 7) ? 2 : 3];
        switch (i17) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i17 == 2 || i17 == 3) {
            objArr[1] = "iterator";
        } else if (i17 == 5 || i17 == 6 || i17 == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i17) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i17 != 2 && i17 != 3 && i17 != 5 && i17 != 6 && i17 != 7) {
            throw new java.lang.IllegalArgumentException(format);
        }
        throw new java.lang.IllegalStateException(format);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(java.lang.Object obj) {
        int i17 = this.f342609d;
        if (i17 == 0) {
            this.f342610e = obj;
        } else if (i17 == 1) {
            this.f342610e = new java.lang.Object[]{this.f342610e, obj};
        } else {
            java.lang.Object[] objArr = (java.lang.Object[]) this.f342610e;
            int length = objArr.length;
            if (i17 >= length) {
                int i18 = ((length * 3) / 2) + 1;
                int i19 = i17 + 1;
                if (i18 < i19) {
                    i18 = i19;
                }
                java.lang.Object[] objArr2 = new java.lang.Object[i18];
                this.f342610e = objArr2;
                java.lang.System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.f342609d] = obj;
        }
        this.f342609d++;
        ((java.util.AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f342610e = null;
        this.f342609d = 0;
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object get(int i17) {
        int i18;
        if (i17 >= 0 && i17 < (i18 = this.f342609d)) {
            return i18 == 1 ? this.f342610e : ((java.lang.Object[]) this.f342610e)[i17];
        }
        throw new java.lang.IndexOutOfBoundsException("Index: " + i17 + ", Size: " + this.f342609d);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator iterator() {
        int i17 = this.f342609d;
        if (i17 == 0) {
            return o26.n.f342605d;
        }
        if (i17 == 1) {
            return new o26.o(this);
        }
        java.util.Iterator it = super.iterator();
        if (it != null) {
            return it;
        }
        d(3);
        throw null;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object remove(int i17) {
        int i18;
        java.lang.Object obj;
        if (i17 < 0 || i17 >= (i18 = this.f342609d)) {
            throw new java.lang.IndexOutOfBoundsException("Index: " + i17 + ", Size: " + this.f342609d);
        }
        if (i18 == 1) {
            obj = this.f342610e;
            this.f342610e = null;
        } else {
            java.lang.Object[] objArr = (java.lang.Object[]) this.f342610e;
            java.lang.Object obj2 = objArr[i17];
            if (i18 == 2) {
                this.f342610e = objArr[1 - i17];
            } else {
                int i19 = (i18 - i17) - 1;
                if (i19 > 0) {
                    java.lang.System.arraycopy(objArr, i17 + 1, objArr, i17, i19);
                }
                objArr[this.f342609d - 1] = null;
            }
            obj = obj2;
        }
        this.f342609d--;
        ((java.util.AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object set(int i17, java.lang.Object obj) {
        int i18;
        if (i17 < 0 || i17 >= (i18 = this.f342609d)) {
            throw new java.lang.IndexOutOfBoundsException("Index: " + i17 + ", Size: " + this.f342609d);
        }
        if (i18 == 1) {
            java.lang.Object obj2 = this.f342610e;
            this.f342610e = obj;
            return obj2;
        }
        java.lang.Object[] objArr = (java.lang.Object[]) this.f342610e;
        java.lang.Object obj3 = objArr[i17];
        objArr[i17] = obj;
        return obj3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f342609d;
    }

    @Override // java.util.List
    public void sort(java.util.Comparator comparator) {
        int i17 = this.f342609d;
        if (i17 >= 2) {
            java.util.Arrays.sort((java.lang.Object[]) this.f342610e, 0, i17, comparator);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public java.lang.Object[] toArray(java.lang.Object[] objArr) {
        if (objArr == null) {
            d(4);
            throw null;
        }
        int length = objArr.length;
        int i17 = this.f342609d;
        if (i17 == 1) {
            if (length == 0) {
                java.lang.Object[] objArr2 = (java.lang.Object[]) java.lang.reflect.Array.newInstance(objArr.getClass().getComponentType(), 1);
                objArr2[0] = this.f342610e;
                return objArr2;
            }
            objArr[0] = this.f342610e;
        } else {
            if (length < i17) {
                java.lang.Object[] copyOf = java.util.Arrays.copyOf((java.lang.Object[]) this.f342610e, i17, objArr.getClass());
                if (copyOf != null) {
                    return copyOf;
                }
                d(6);
                throw null;
            }
            if (i17 != 0) {
                java.lang.System.arraycopy(this.f342610e, 0, objArr, 0, i17);
            }
        }
        int i18 = this.f342609d;
        if (length > i18) {
            objArr[i18] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i17, java.lang.Object obj) {
        int i18;
        if (i17 >= 0 && i17 <= (i18 = this.f342609d)) {
            if (i18 == 0) {
                this.f342610e = obj;
            } else if (i18 == 1 && i17 == 0) {
                this.f342610e = new java.lang.Object[]{obj, this.f342610e};
            } else {
                java.lang.Object[] objArr = new java.lang.Object[i18 + 1];
                if (i18 == 1) {
                    objArr[0] = this.f342610e;
                } else {
                    java.lang.Object[] objArr2 = (java.lang.Object[]) this.f342610e;
                    java.lang.System.arraycopy(objArr2, 0, objArr, 0, i17);
                    java.lang.System.arraycopy(objArr2, i17, objArr, i17 + 1, this.f342609d - i17);
                }
                objArr[i17] = obj;
                this.f342610e = objArr;
            }
            this.f342609d++;
            ((java.util.AbstractList) this).modCount++;
            return;
        }
        throw new java.lang.IndexOutOfBoundsException("Index: " + i17 + ", Size: " + this.f342609d);
    }
}
