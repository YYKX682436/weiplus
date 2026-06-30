package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public final class ContentsSchemeResolver extends com.tencent.mm.vfs.SingletonSchemeResolver {
    public static final com.tencent.mm.vfs.c0 CREATOR = new com.tencent.mm.vfs.c0(null);

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.vfs.ContentsSchemeResolver.ContentProviderFileSystem f212700d = new com.tencent.mm.vfs.ContentsSchemeResolver.ContentProviderFileSystem(com.tencent.mm.vfs.a3.f212781a.f212813d);

    /* loaded from: classes12.dex */
    public static final class ContentProviderFileSystem extends com.tencent.mm.vfs.a implements com.tencent.mm.vfs.FileSystem {
        public static final android.os.Parcelable.Creator<com.tencent.mm.vfs.ContentsSchemeResolver.ContentProviderFileSystem> CREATOR = null;

        /* renamed from: e, reason: collision with root package name */
        public final android.content.ContentResolver f212701e;

        public ContentProviderFileSystem(android.content.Context context) {
            this.f212701e = context.getContentResolver();
        }

        @Override // com.tencent.mm.vfs.q2
        public java.lang.Iterable C(java.lang.String str) {
            return null;
        }

        @Override // com.tencent.mm.vfs.q2
        public java.lang.String D(java.lang.String str, boolean z17) {
            return null;
        }

        @Override // com.tencent.mm.vfs.q2
        public boolean F(java.lang.String str) {
            return m(str) != null;
        }

        @Override // com.tencent.mm.vfs.q2
        public java.io.InputStream a(java.lang.String str) {
            try {
                java.io.InputStream openInputStream = this.f212701e.openInputStream(android.net.Uri.parse(str));
                if (openInputStream != null) {
                    return openInputStream;
                }
                throw new java.io.FileNotFoundException("ContentResolver returns null");
            } catch (java.lang.RuntimeException e17) {
                throw ((java.io.FileNotFoundException) new java.io.FileNotFoundException(str + " cannot be opened: " + e17.getMessage()).initCause(e17));
            }
        }

        @Override // com.tencent.mm.vfs.a0
        public java.lang.Object b(java.util.Map map) {
            return this;
        }

        @Override // com.tencent.mm.vfs.q2
        public java.io.OutputStream c(java.lang.String str, boolean z17) {
            try {
                java.io.OutputStream openOutputStream = this.f212701e.openOutputStream(android.net.Uri.parse(str), z17 ? "wa" : "w");
                if (openOutputStream != null) {
                    return openOutputStream;
                }
                throw new java.io.FileNotFoundException("ContentResolver returns null");
            } catch (java.lang.RuntimeException e17) {
                throw ((java.io.FileNotFoundException) new java.io.FileNotFoundException(str + " cannot be opened: " + e17.getMessage()).initCause(e17));
            }
        }

        @Override // com.tencent.mm.vfs.q2
        public boolean d(java.lang.String str) {
            try {
                return this.f212701e.delete(android.net.Uri.parse(str), null, null) >= 1;
            } catch (java.lang.RuntimeException unused) {
                return false;
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.tencent.mm.vfs.q2
        public boolean e(java.lang.String str, boolean z17) {
            return false;
        }

        @Override // com.tencent.mm.vfs.q2
        public com.tencent.mm.vfs.o2 g(java.lang.String str) {
            return new com.tencent.mm.vfs.o2();
        }

        @Override // com.tencent.mm.vfs.q2
        public java.lang.Iterable list(java.lang.String str) {
            return null;
        }

        @Override // com.tencent.mm.vfs.q2
        public com.tencent.mm.vfs.x1 m(java.lang.String str) {
            android.database.Cursor cursor;
            android.database.Cursor cursor2 = null;
            try {
                cursor = this.f212701e.query(android.net.Uri.parse(str), null, null, null, null);
                if (cursor == null) {
                    com.tencent.mm.vfs.e8.d(cursor);
                    return null;
                }
                try {
                    int columnIndex = cursor.getColumnIndex("_display_name");
                    int columnIndex2 = cursor.getColumnIndex("_size");
                    if (!cursor.moveToFirst()) {
                        com.tencent.mm.vfs.e8.d(cursor);
                        return null;
                    }
                    com.tencent.mm.vfs.x1 x1Var = new com.tencent.mm.vfs.x1(this, str, cursor.getString(columnIndex), cursor.getLong(columnIndex2), 0L, 0L, false);
                    com.tencent.mm.vfs.e8.d(cursor);
                    return x1Var;
                } catch (java.lang.RuntimeException unused) {
                    com.tencent.mm.vfs.e8.d(cursor);
                    return null;
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    cursor2 = cursor;
                    com.tencent.mm.vfs.e8.d(cursor2);
                    throw th;
                }
            } catch (java.lang.RuntimeException unused2) {
                cursor = null;
            } catch (java.lang.Throwable th7) {
                th = th7;
            }
        }

        @Override // com.tencent.mm.vfs.q2
        public boolean n(java.lang.String str, long j17) {
            return false;
        }

        @Override // com.tencent.mm.vfs.q2
        public int o() {
            return 1;
        }

        @Override // com.tencent.mm.vfs.q2
        public boolean r(java.lang.String str) {
            return false;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.tencent.mm.vfs.a, com.tencent.mm.vfs.q2
        public android.os.ParcelFileDescriptor x(java.lang.String str, java.lang.String str2) {
            try {
                android.os.ParcelFileDescriptor openFileDescriptor = this.f212701e.openFileDescriptor(android.net.Uri.parse(str), str2);
                if (openFileDescriptor != null) {
                    return openFileDescriptor;
                }
                throw new java.io.FileNotFoundException("ContentResolver returns null");
            } catch (java.lang.RuntimeException e17) {
                throw ((java.io.FileNotFoundException) new java.io.FileNotFoundException(str + " cannot be opened: " + e17.getMessage()).initCause(e17));
            }
        }

        @Override // com.tencent.mm.vfs.q2
        public com.tencent.mm.vfs.FileSystem y() {
            return this;
        }
    }

    public ContentsSchemeResolver(com.tencent.mm.vfs.b0 b0Var) {
    }

    @Override // com.tencent.mm.vfs.s5
    public android.util.Pair a(com.tencent.mm.vfs.m5 m5Var, com.tencent.mm.vfs.z7 z7Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = z7Var.f213277d;
        if (str != null) {
            sb6.append(str);
            sb6.append(':');
        }
        java.lang.String str2 = z7Var.f213278e;
        if (str2 != null) {
            sb6.append("//");
            sb6.append(str2);
        }
        java.lang.String str3 = z7Var.f213279f;
        if (str3 != null) {
            sb6.append(str3);
        }
        return android.util.Pair.create(this.f212700d, sb6.toString());
    }
}
